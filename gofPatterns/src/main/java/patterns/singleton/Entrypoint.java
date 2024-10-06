package patterns.singleton;

import patterns.singleton.models.ResourceAccessSynchronizer;

public class Entrypoint {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            ResourceAccessSynchronizer synchronizer = ResourceAccessSynchronizer.getInstance();
            synchronizer.accessResource("Thread 1");
        });

        Thread t2 = new Thread(() -> {
            ResourceAccessSynchronizer synchronizer = ResourceAccessSynchronizer.getInstance();
            synchronizer.accessResource("Thread 2");
        });

        Thread t3 = new Thread(() -> {
            ResourceAccessSynchronizer synchronizer = ResourceAccessSynchronizer.getInstance();
            synchronizer.accessResource("Thread 3");
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
