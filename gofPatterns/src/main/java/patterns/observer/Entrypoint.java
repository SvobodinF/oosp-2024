package patterns.observer;

import patterns.observer.interfaces.NetworkObserver;
import patterns.observer.models.admins.NetworkAdmin;
import patterns.observer.models.devices.Router;

public class Entrypoint {
    public static void main(String[] args) {
        Router router1 = new Router("Router-1");
        Router router2 = new Router("Router-2");

        NetworkObserver admin1 = new NetworkAdmin("Admin-1");
        NetworkObserver admin2 = new NetworkAdmin("Admin-2");

        router1.addObserver(admin1);
        router1.addObserver(admin2);
        router2.addObserver(admin1);

        router1.setStatus("Offline");
        router2.setStatus("Maintenance");

        router1.removeObserver(admin1);
        router1.setStatus("Online");
    }
}
