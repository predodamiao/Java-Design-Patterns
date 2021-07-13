package Memento;

import java.util.ArrayList;
import java.util.List;

public class System {
    private String name;
    private Snapshot current;
    private List<Snapshot> memento = new ArrayList<Snapshot>();

    public System () {
    }

    public System (String name) {
        this.name = name;
    }

    public Snapshot getCurrentSnapshot() {
        return this.current;
    }

    public void deploy(Snapshot snapshot) {
        this.current = snapshot.deploy();
        this.memento.add(this.current);
    }

    public void restoreVersion(int index) {
        if (index < 0 || index > this.memento.size() - 1) {
            throw new IllegalArgumentException("Snapshot not found");
        }
        this.current = this.memento.get(index);
    }

    public void restoreLastVersion() {
        if (this.memento.size()<=1) {
            throw new IllegalArgumentException("Snapshot not found");
        }
        this.current = this.memento.get(this.memento.size()-2);
    }

    public List<Snapshot> getAllSnapshots() {
        return this.memento;
    }

    public void cleanOldSnapshots() {
        this.memento.clear();
        this.memento.add(this.current);
    }
}
