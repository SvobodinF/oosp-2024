package patterns.composite;

import patterns.composite.models.*;

public class Entrypoint {
    public static void main(String[] args) {
        Task task1 = new Task("Create Entrypoint");
        Task task2 = new Task("Create composite pattern");
        Task task3 = new Task("Test pattern workflow");

        ProjectStage developmentStage = new ProjectStage("Development Stage");
        developmentStage.add(task1);
        developmentStage.add(task2);
        developmentStage.add(task3);

        Task task4 = new Task("Refactor written code");
        ProjectStage testingStage = new ProjectStage("Refactoring");
        testingStage.add(task4);

        Project project = new Project("OOSP-Practice");
        project.add(developmentStage);
        project.add(testingStage);

        project.execute();
    }
}
