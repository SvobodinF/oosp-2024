package patterns.memento.models;

public class ServerConfig {
    private String configuration;

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
        System.out.println("Set config to: " + configuration);
    }

    public ServerConfigSnapshot saveConfiguration() {
        System.out.println("Configuration saved...");
        return new ServerConfigSnapshot(configuration);
    }

    public void restoreConfiguration(ServerConfigSnapshot snapshot) {
        this.configuration = snapshot.getConfiguration();
        System.out.println("Restored to: " + configuration);
    }
}
