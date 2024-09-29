package patterns.observer.models.devices;

import patterns.observer.interfaces.NetworkDevice;
import patterns.observer.interfaces.NetworkObserver;

import java.util.HashSet;

public class Router implements NetworkDevice {
    private HashSet<NetworkObserver> observers;
    private final String deviceName;
    private String status;

    public Router(String deviceName) {
        this.deviceName = deviceName;
        this.observers = new HashSet<NetworkObserver>();
    }

    public void addObserver(NetworkObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(NetworkObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (NetworkObserver observer: observers) {
            observer.update(deviceName, status);
        }
    }

    // Метод для изменения статуса устройства (например, сбой)
    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}
