package State;

public class TaskStateInProgress implements TaskState{

    private TaskStateInProgress() {};
    private static TaskStateInProgress instance = new TaskStateInProgress();
    public static TaskStateInProgress getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "IN PROGRESS";
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
        task.setState(TaskStateValidation.getInstance());
        return true;
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
