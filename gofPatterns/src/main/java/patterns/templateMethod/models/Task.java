package patterns.templateMethod.models;

public abstract class Task {
    public final void execute() {
        initialize();
        executeTask();
        cleanup();
    }

    protected abstract void initialize();
    protected abstract void executeTask();
    protected abstract void cleanup();
}
