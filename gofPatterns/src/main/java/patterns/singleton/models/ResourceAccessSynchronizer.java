package patterns.singleton.models;

public class ResourceAccessSynchronizer {
    private static volatile ResourceAccessSynchronizer instance;

    private ResourceAccessSynchronizer() { }

    public static ResourceAccessSynchronizer getInstance() {
        if (instance == null) {
            synchronized (ResourceAccessSynchronizer.class) {
                if (instance == null) {
                    instance = new ResourceAccessSynchronizer();
                }
            }
        }
        return instance;
    }

    public synchronized void accessResource(String threadName) {
        System.out.println(threadName + " is accessing the shared resource.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + " has finished accessing the shared resource.");
    }
}
