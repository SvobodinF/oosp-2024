package patterns.observer.models.admins;

import patterns.observer.interfaces.NetworkObserver;

public class NetworkAdmin implements NetworkObserver {
    private String adminName;

    public NetworkAdmin(String adminName) {
        this.adminName = adminName;
    }
    public void update(String deviceName, String status) {
        System.out.println("Administrator " + adminName + " notified: "
                + "Device " + deviceName + " is now " + status);
    }
}
