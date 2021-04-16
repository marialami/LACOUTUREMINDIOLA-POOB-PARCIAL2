package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NormalActivity extends Activity {

    private List<Step> steps;

    public NormalActivity(String name, String state, Iteration iteration) {
        super(name, state, iteration);
        this.steps = new ArrayList<>();
    }

    public void addStep(Step step) {
        this.steps.add(step);
    }

    @Override
    public Duration getDuration() throws SabanaResearchException {

        Duration duration;
        Duration duration1 = Duration.ofDays(0);

        if (this.steps.size()==0) {

            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_NORMAL_ACTIVITY);
        }

        for (Step s: this.steps) {

           duration = s.getDuration();
           duration.plus(duration1);
        }

        return duration1;
    }

    public List<Step> getSteps() {
        return steps;
    }
}
