package patterns.facade;

import patterns.facade.models.ProjectFacade;

public class Entrypoint {
    public static void main(String[] args) {
        ProjectFacade projectFacade = new ProjectFacade();

        String task = "Make facade pattern";
        String assignee = "Student-1";
        String assigneeOther = "Student-2";
        String resource = "Java-developer";

        projectFacade.createAndAssignTask(task, assignee, "20-10-2024");
        projectFacade.reassignTask(task, assigneeOther);
        projectFacade.allocateResourceToTask(task, resource);
        projectFacade.extendTaskDeadline(task, "2024-10-30");
        projectFacade.completeTask(task, resource);
    }
}
