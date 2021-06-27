package State;

public class TaskStateBacklog implements TaskState{

    private TaskStateBacklog() {};
    private static TaskStateBacklog instance = new TaskStateBacklog();
    public static TaskStateBacklog getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "BACKLOG";
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
        task.setState(TaskStateInProgress.getInstance());
        return true;
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
