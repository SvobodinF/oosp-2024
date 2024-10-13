package patterns.facade.models.handlers;

public class TaskHandler {
    public void createTask(String taskName) {
        System.out.println("Task '" + taskName + "' created.");
    }

    public void assignTask(String taskName, String assignee) {
        System.out.println("Task '" + taskName + "' assigned to " + assignee + ".");
    }
}