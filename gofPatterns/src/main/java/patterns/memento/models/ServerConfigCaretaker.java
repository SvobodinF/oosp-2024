package patterns.memento.models;

import java.util.ArrayList;
import java.util.List;

public class ServerConfigCaretaker {
    private final List<ServerConfigSnapshot> snapshotList = new ArrayList<ServerConfigSnapshot>();

    public void addSnapshot(ServerConfigSnapshot memento) {
        snapshotList.add(memento);
    }

    public ServerConfigSnapshot getSnapshot(int index) {
        return snapshotList.get(index);
    }
}
