package entities;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private Group group;
    private List<Iteration> iterations;

    public Project(String name, LocalDate dateInit, LocalDate dateEnd, Group group) {
        this.name = name;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        this.group = group;
        this.iterations = new ArrayList<>();

        group.addProject(this);
    }

    public void addIteration(Iteration iteration) {
        this.iterations.add(iteration);
    }

    public Duration getDuration() throws SabanaResearchException {

        Duration duration;
        Duration duration1 = Duration.ofDays(0);

        if (this.iterations.size() == 0) {

            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_PROJECT);
        }

        for (Iteration i: this.iterations) {

            duration = i.getDuration();
            duration1.plus(duration);
        }

        return Duration.ofDays(3);
    }


}
