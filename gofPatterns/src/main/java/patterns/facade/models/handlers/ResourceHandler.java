package patterns.facade.models.handlers;

public class ResourceHandler {
    public void allocateResource(String taskName, String resource) {
        System.out.println("Resource '" + resource + "' allocated to task '" + taskName + "'.");
    }

    public void releaseResource(String taskName, String resource) {
        System.out.println("Resource '" + resource + "' released from task '" + taskName + "'.");
    }
}
