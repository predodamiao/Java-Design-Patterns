package State;

public class Task {

    private String name;
    private TaskState state;

    public Task () {
        this.state = TaskStateOpen.getInstance();
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public TaskState getState () {
        return state;
    }

    public void setState (TaskState state) {
        this.state = state;
    }

    public String getStateName () {
        return state.getState();
    }

    Boolean open () {
        return state.open(this);
    }

    Boolean toBacklog () {
        return state.toBacklog(this);
    }

    Boolean toInProgress () {
        return state.toInProgress(this);
    }

    Boolean toValidation () {
        return state.toValidation(this);
    }

    Boolean done () {
        return state.done(this);
    }

    Boolean close () {
        return state.close(this);
    }

    Boolean cancel () {
        return state.cancel(this);
    }

}
