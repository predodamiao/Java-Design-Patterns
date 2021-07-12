package Observer;

public class Client{

    private String name;
    private Integer positionInQueue;

    public Client (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public Client setName (String name) {
        this.name = name;
        return this;
    }

    public Integer getPositionInQueue () {
        return positionInQueue;
    }

    public void enterQueue(ServiceQueue queue){
        queue.addObserver(this);
    }

    public Client setPositionInQueue (Integer positionInQueue) {
        this.positionInQueue = positionInQueue;
        return this;
    }
    public void update (ServiceQueue o, Object arg) {
        if(o.getActual().equals(this))
            positionInQueue = null;
        else
            positionInQueue--;
    }
}
