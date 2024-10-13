package patterns.facade.models.handlers;

public class DeadlineHandler {
    public void setDeadline(String taskName, String deadline) {
        System.out.println("Deadline for task '" + taskName + "' set to " + deadline + ".");
    }

    public void extendDeadline(String taskName, String newDeadline) {
        System.out.println("Deadline for task '" + taskName + "' extended to " + newDeadline + ".");
    }
}