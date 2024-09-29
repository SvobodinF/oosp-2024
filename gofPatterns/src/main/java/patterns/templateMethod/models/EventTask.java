package patterns.templateMethod.models;

public class EventTask extends Task {

    @Override
    protected void initialize() {
        System.out.println("EventTask: Setting up event logistics.");
    }

    @Override
    protected void executeTask() {
        System.out.println("EventTask: Executing the event schedule.");
    }

    @Override
    protected void cleanup() {
        System.out.println("EventTask: Wrapping up event and clearing resources.");
    }
}
