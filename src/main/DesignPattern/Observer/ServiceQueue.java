package Observer;

import java.util.ArrayList;

public class ServiceQueue{

    private boolean changed = false;
    private ArrayList<Client> queue;
    private Client actual;

    public ServiceQueue() {
        queue = new ArrayList<Client>();
    }

    public void addObserver(Client o) {
        if (o == null)
            throw new NullPointerException();
        if (!queue.contains(o)) {
            queue.add(o);
            o.setPositionInQueue(this.countObservers());
        }
    }

    private Integer countObservers () {
        return queue.size();
    }

    public synchronized void deleteObserver(Client o) {
        queue.remove(o);
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {
        if (!changed)
            return;

        clearChanged();

        queue.forEach(client ->{
            client.update(this, arg);
        });

    }

    protected synchronized void setChanged() {
        changed = true;
    }

    protected void clearChanged() {
        changed = false;
    }

    public boolean hasChanged() {
        return changed;
    }

    public void next(){
        if(queue.size() > 0) {
            setChanged();
            actual = queue.get(0);
        }
        notifyObservers();
        queue.remove(actual);
    }

    public Client getActual () {
        return actual;
    }

}
