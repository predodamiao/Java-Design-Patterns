package State;

public class TaskStateDone implements TaskState{

    private TaskStateDone() {};
    private static TaskStateDone instance = new TaskStateDone();
    public static TaskStateDone getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "DONE";
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
        task.setState(TaskStateClosed.getInstance());
        return true;
    }

    @Override
    public Boolean cancel(Task task) {
        task.setState(TaskStateCanceled.getInstance());
        return true;
    }
}
