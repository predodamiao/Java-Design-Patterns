package State;

public class TaskStateClosed implements TaskState{

    private TaskStateClosed() {};
    private static TaskStateClosed instance = new TaskStateClosed();
    public static TaskStateClosed getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "CLOSED";
    }

    @Override
    public Boolean open(Task task) {
        throw new IllegalStateException("Illegal Operation");
    }

    @Override
    public Boolean toBacklog(Task task) {
        throw new IllegalStateException("Illegal Operation");
    }

    @Override
    public Boolean toInProgress(Task task) {
        throw new IllegalStateException("Illegal Operation");
    }

    @Override
    public Boolean toValidation(Task task) {
        throw new IllegalStateException("Illegal Operation");
    }

    @Override
    public Boolean done(Task task) {
        throw new IllegalStateException("Illegal Operation");
    }

    @Override
    public Boolean close(Task task) {
        throw new IllegalStateException("Illegal Operation");
    }

    @Override
    public Boolean cancel(Task task) {
        throw new IllegalStateException("Illegal Operation");
    }
}
