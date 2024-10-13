package patterns.composite.models;

import patterns.composite.interfaces.ProjectComponent;

public class Task implements ProjectComponent {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void add(ProjectComponent component) {
        throw new UnsupportedOperationException("Cannot add components to a task.");
    }

    @Override
    public void remove(ProjectComponent component) {
        throw new UnsupportedOperationException("Cannot remove components from a task.");
    }

    @Override
    public ProjectComponent getChild(int index) {
        throw new UnsupportedOperationException("No child for task.");
    }

    @Override
    public void execute() {
        System.out.println("Executing task: " + taskName);
    }
}
