package State;

public class TaskStateCanceled implements TaskState{

    private TaskStateCanceled() {};
    private static TaskStateCanceled instance = new TaskStateCanceled();
    public static TaskStateCanceled getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "CANCELED";
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
