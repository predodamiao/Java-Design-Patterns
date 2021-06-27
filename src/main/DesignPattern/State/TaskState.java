package State;

public interface TaskState {

    String getState();

    Boolean open(Task task);

    Boolean toBacklog(Task task);

    Boolean toInProgress(Task task);

    Boolean toValidation(Task task);

    Boolean done(Task task);

    Boolean close(Task task);

    Boolean cancel(Task task);
}
