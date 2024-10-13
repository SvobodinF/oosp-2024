package patterns.facade.models;

import patterns.facade.models.handlers.*;

public class ProjectFacade {
    private final TaskHandler taskHandler;
    private final DeadlineHandler deadlineHandler;
    private final ResourceHandler resourceHandler;

    public ProjectFacade() {
        this.taskHandler = new TaskHandler();
        this.deadlineHandler = new DeadlineHandler();
        this.resourceHandler = new ResourceHandler();
    }

    public void createAndAssignTask(String taskName, String assignee, String deadline) {
        taskHandler.createTask(taskName);
        taskHandler.assignTask(taskName, assignee);
        deadlineHandler.setDeadline(taskName, deadline);
    }

    public void reassignTask(String taskName, String newAssignee) {
        taskHandler.assignTask(taskName, newAssignee);
    }

    public void allocateResourceToTask(String taskName, String resource) {
        resourceHandler.allocateResource(taskName, resource);
    }

    public void extendTaskDeadline(String taskName, String newDeadline) {
        deadlineHandler.extendDeadline(taskName, newDeadline);
    }

    public void completeTask(String taskName, String resource) {
        resourceHandler.releaseResource(taskName, resource);
        System.out.println("Task '" + taskName + "' completed.");
    }
}
