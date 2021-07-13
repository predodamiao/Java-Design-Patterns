package Memento;

import java.time.LocalDateTime;

public class Snapshot {
    private String version;
    private LocalDateTime creationDate;
    private LocalDateTime deployDate;

    public Snapshot (String version, LocalDateTime creationDate) {
        this.version = version;
        this.creationDate = creationDate;
    }

    public Snapshot (String version) {
        this.version = version;
        this.creationDate = LocalDateTime.now();
    }

    public Snapshot deploy () {
        this.deployDate = LocalDateTime.now();
        return this;
    }

    public String getVersion () {
        return this.version;
    }

    @Override
    public String toString(){
        if(this.deployDate != null)
            return "Version "+this.version+" created at "+this.creationDate.toString()+" and deployed at"+deployDate.toString();
        else
            return "Version "+this.version+" created at "+this.creationDate.toString()+" and not deployed yet";
    }

}
