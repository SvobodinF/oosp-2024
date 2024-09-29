package patterns.templateMethod;

import patterns.templateMethod.models.*;

public class Entrypoint {
    public static void main(String[] args) {
        Task simpleTask = new SimpleTask();
        Task projectTask = new ProjectTask();
        Task eventTask = new EventTask();

        System.out.println("Executing Simple Task:");
        simpleTask.execute();

        System.out.println("\nExecuting Project Task:");
        projectTask.execute();

        System.out.println("\nExecuting Event Task:");
        eventTask.execute();
    }
}
