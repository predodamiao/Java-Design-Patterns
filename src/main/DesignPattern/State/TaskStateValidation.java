package State;

public class TaskStateValidation implements TaskState{

    private TaskStateValidation() {};
    private static TaskStateValidation instance = new TaskStateValidation();
    public static TaskStateValidation getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "VALIDATION";
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
        task.setState(TaskStateDone.getInstance());
        return true;
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
