package patterns.templateMethod.models;

public class ProjectTask extends Task {

    @Override
    protected void initialize() {
        System.out.println("ProjectTask: Initializing project resources.");
    }

    @Override
    protected void executeTask() {
        System.out.println("ProjectTask: Executing project-related tasks.");
    }

    @Override
    protected void cleanup() {
        System.out.println("ProjectTask: Finalizing project and cleaning up.");
    }
}
