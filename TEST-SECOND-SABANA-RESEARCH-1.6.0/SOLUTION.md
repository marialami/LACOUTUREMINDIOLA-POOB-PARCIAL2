## SOLUTION

DISEÑO

1.  /**
     * Summarize the duration of a project
     *
     * @return the duration of the project
     */
     
     public Duration summarize() {}
     
2.
![Diagrama de secuencia Synthetizers](https://user-images.githubusercontent.com/78276253/115091935-96829280-9ede-11eb-8de9-3f8c56907241.png)

3.
![Diagrama de Clases Actualizado](https://user-images.githubusercontent.com/78276253/115093547-51f7f680-9ee0-11eb-888a-36548023e43d.png)

4. /**
     * Get the student synthetizer
     *
     * @return the student synthetizer
     */
     
     public Duration getStudentSynthetizer() {}
     
     /**
     * Get the executive synthetizer
     *
     * @return the executive synthetizer
     */
     
     public Duration getExecutiveSynthetizer() {}
     
      /**
     * Get the student name
     *
     * @return the student name
     */
     
     public String getName() {}
     
     /**
     * Get the student working duration
     *
     * @return the student working duration
     */
     
     public Duration getWorkingDuration() {}
     
     /**
     * Get the iteration goal
     *
     * @return the iteration goal
     */
     
     public String getGoal() {}
     
     /**
     * Get the iteration duration
     *
     * @return the iteration duration
     */
     
     public String getDuration() {}


CONCEPTOS

1. ¿Cuáles son las acciones los tres momentos importantes de las excepciones? ¿Cuál es el objetivo de cada una? ¿Cómo se implementa en Java cada acción?
Las excepciones tienen tres momentos:

Throw: Al crear una instancia de una excepción y agregando la palabra reservada "throw" lanzamos una excepción en Java. Una excepción se lanza cuando hay algun error o dato incorrecto en un método.

Propagate: Cuando lanzamos una excepción podemos hacer dos cosas con ella: propagarla o atraparla. Cuando propagamos una excepción, colocamos "throws Exception" en la firma del método. Si no, el compilador nos dice que hay una excepción que puede ser lanzada con el fin de que la controlemos.

Catch: Nos hacemos responsables y atrapamos la excepción. Con un "try" y un "catch" intentamos ejecutar un método y si hay una excepción la atrapamos. Se podría pensar que funciona similar a un "if" y un "else" en donde atrapamos y controlamos una excepción.


2. ¿Qué es sobre-escritura de métodos? ¿Por qué aplicarla? ¿Cómo impedir que se sobre-escriba un método?

La sobre-escritura de métodos es una forma de darle a un método una implementación diferente en otra clase. Sobre-escribimos métodos porque hay veces que la implementación ya definida para el método no es la más adecuada para la clase en la que estamos trabajando y necesitamos que esta realice una función distinta. Para que un método no pueda ser sobre-escrito, usamos la palabra "final" en la firma del método. Esto indica que esa es la implementación final del método y no puede ser cambiada o sobre-escrita en alguna otra clase.
