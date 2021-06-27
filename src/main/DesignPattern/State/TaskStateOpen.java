package State;

public class TaskStateOpen implements TaskState{

    private TaskStateOpen() {};
    private static TaskStateOpen instance = new TaskStateOpen();
    public static TaskStateOpen getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "OPEN";
    }

    @Override
    public Boolean open(Task task) {
        throw new IllegalStateException("Illegal Operation");
    }

    @Override
    public Boolean toBacklog(Task task) {
        task.setState(TaskStateBacklog.getInstance());
        return true;
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
        task.setState(TaskStateCanceled.getInstance());
        return true;
    }
}
