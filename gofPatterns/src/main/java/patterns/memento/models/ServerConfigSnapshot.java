package patterns.memento.models;

public class ServerConfigSnapshot {
    private final String configuration;
    public ServerConfigSnapshot(String configuration) {
        this.configuration = configuration;
    }
    public String getConfiguration() {
        return configuration;
    }
}
