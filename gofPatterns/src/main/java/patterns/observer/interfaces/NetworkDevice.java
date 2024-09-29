package patterns.observer.interfaces;

public interface NetworkDevice {
    void addObserver(NetworkObserver observer);
    void removeObserver(NetworkObserver observer);
    void notifyObservers();
}
