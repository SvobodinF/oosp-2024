package patterns.memento;

import patterns.memento.models.ServerConfig;
import patterns.memento.models.ServerConfigCaretaker;

public class Entrypoint {
    private static ServerConfigCaretaker configCaretaker;
    public static void main(String[] args) {
        configCaretaker = new ServerConfigCaretaker();

        ServerConfig serverConfig = new ServerConfig();

        setConfig(serverConfig, "Version 1.0");
        setConfig(serverConfig, "Version 2.0");
        setConfig(serverConfig, "Version 3.0");

        serverConfig.restoreConfiguration(configCaretaker.getSnapshot(0));
    }

    private static void setConfig(ServerConfig config, String data){
        config.setConfiguration(data);
        configCaretaker.addSnapshot(config.saveConfiguration());
    }
}
