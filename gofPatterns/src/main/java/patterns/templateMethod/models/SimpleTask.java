package patterns.templateMethod.models;

public class SimpleTask extends Task{
    @Override
    protected void initialize() {
        System.out.println("SimpleTask: Initializing resources.");
    }

    @Override
    protected void executeTask() {
        System.out.println("SimpleTask: Executing the main task logic.");
    }

    @Override
    protected void cleanup() {
        System.out.println("SimpleTask: Cleaning up resources.");
    }
}
