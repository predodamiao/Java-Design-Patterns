package State;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    Task task;

    @BeforeEach
    public void init(){
        task = new Task();
    }

    @Test
    public void initialStateShouldBeOpen() {
        Task task = new Task();
        assertEquals("OPEN", task.getStateName());
    }

    // Open

    @Test
    public void OpenTaskShouldNotOpen() {
        task.setState(TaskStateOpen.getInstance());
        try{
            task.open();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void OpenTaskShouldBacklog() {
        task.setState(TaskStateOpen.getInstance());
        assertTrue(task.toBacklog());
        assertEquals("BACKLOG", task.getStateName());
    }

    @Test
    public void OpenTaskShouldNotInProgress() {
        task.setState(TaskStateOpen.getInstance());
        try{
            task.toInProgress();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void OpenTaskShouldNotValidation() {
        task.setState(TaskStateOpen.getInstance());
        try{
            task.toValidation();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void OpenTaskShouldNotDone() {
        task.setState(TaskStateOpen.getInstance());
        try{
            task.done();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void OpenTaskShouldNotClose() {
        task.setState(TaskStateOpen.getInstance());
        try{
            task.close();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void OpenTaskShouldCancel() {
        task.setState(TaskStateOpen.getInstance());
        assertTrue(task.cancel());
        assertEquals("CANCELED", task.getStateName());
    }


    // Backlog

    @Test
    public void BacklogTaskShouldNotOpen() {
        task.setState(TaskStateBacklog.getInstance());
        try{
            task.open();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void BacklogTaskShouldNotBacklog() {
        task.setState(TaskStateBacklog.getInstance());
        try{
            task.toBacklog();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void BacklogTaskShouldInProgress() {
        task.setState(TaskStateBacklog.getInstance());
        assertTrue(task.toInProgress());
        assertEquals("IN PROGRESS", task.getStateName());
    }

    @Test
    public void BacklogTaskShouldNotValidation() {
        task.setState(TaskStateBacklog.getInstance());
        try{
            task.toValidation();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void BacklogTaskShouldNotDone() {
        task.setState(TaskStateBacklog.getInstance());
        try{
            task.done();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void BacklogTaskShouldNotClose() {
        task.setState(TaskStateBacklog.getInstance());
        try{
            task.close();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void BacklogTaskShouldCancel() {
        task.setState(TaskStateBacklog.getInstance());
        assertTrue(task.cancel());
        assertEquals("CANCELED", task.getStateName());
    }


    // InProgress

    @Test
    public void InProgressTaskShouldNotOpen() {
        task.setState(TaskStateInProgress.getInstance());
        try{
            task.open();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void InProgressTaskShouldBacklog() {
        task.setState(TaskStateInProgress.getInstance());
        assertTrue(task.toBacklog());
        assertEquals("BACKLOG", task.getStateName());
    }

    @Test
    public void InProgressTaskShouldNotInProgress() {
        task.setState(TaskStateInProgress.getInstance());
        try{
            task.toInProgress();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void InProgressTaskShouldValidation() {
        task.setState(TaskStateInProgress.getInstance());
        assertTrue(task.toValidation());
        assertEquals("VALIDATION", task.getStateName());
    }

    @Test
    public void InProgressTaskShouldNotDone() {
        task.setState(TaskStateInProgress.getInstance());
        try{
            task.done();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void InProgressTaskShouldNotClose() {
        task.setState(TaskStateInProgress.getInstance());
        try{
            task.close();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void InProgressTaskShouldCancel() {
        task.setState(TaskStateInProgress.getInstance());
        assertTrue(task.cancel());
        assertEquals("CANCELED", task.getStateName());
    }


    // Validation

    @Test
    public void ValidationTaskShouldNotOpen() {
        task.setState(TaskStateValidation.getInstance());
        try{
            task.open();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void ValidationTaskShouldBacklog() {
        task.setState(TaskStateValidation.getInstance());
        assertTrue(task.toBacklog());
        assertEquals("BACKLOG", task.getStateName());
    }

    @Test
    public void ValidationTaskShouldNotInProgress() {
        task.setState(TaskStateValidation.getInstance());
        try{
            task.toInProgress();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void ValidationTaskShouldNotValidation() {
        task.setState(TaskStateValidation.getInstance());
        try{
            task.toValidation();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void ValidationTaskShouldDone() {
        task.setState(TaskStateValidation.getInstance());
        assertTrue(task.done());
        assertEquals("DONE", task.getStateName());
    }

    @Test
    public void ValidationTaskShouldNotClose() {
        task.setState(TaskStateValidation.getInstance());
        try{
            task.close();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void ValidationTaskShouldCancel() {
        task.setState(TaskStateValidation.getInstance());
        assertTrue(task.cancel());
        assertEquals("CANCELED", task.getStateName());
    }

    // Done

    @Test
    public void DoneTaskShouldNotOpen() {
        task.setState(TaskStateDone.getInstance());
        try{
            task.open();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void DoneTaskShouldNotBacklog() {
        task.setState(TaskStateDone.getInstance());
        try{
            task.toBacklog();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void DoneTaskShouldNotInProgress() {
        task.setState(TaskStateDone.getInstance());
        try{
            task.toInProgress();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void DoneTaskShouldNotValidation() {
        task.setState(TaskStateDone.getInstance());
        try{
            task.toValidation();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void DoneTaskShouldNotDone() {
        task.setState(TaskStateDone.getInstance());
        try{
            task.done();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void DoneTaskShouldClose() {
        task.setState(TaskStateDone.getInstance());
        assertTrue(task.close());
        assertEquals("CLOSED", task.getStateName());
    }

    @Test
    public void DoneTaskShouldCancel() {
        task.setState(TaskStateDone.getInstance());
        assertTrue(task.cancel());
        assertEquals("CANCELED", task.getStateName());
    }

    // Closed

    @Test
    public void ClosedTaskShouldNotOpen() {
        task.setState(TaskStateClosed.getInstance());
        try{
            task.open();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void ClosedTaskShouldNotBacklog() {
        task.setState(TaskStateClosed.getInstance());
        try{
            task.toBacklog();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void ClosedTaskShouldNotInProgress() {
        task.setState(TaskStateClosed.getInstance());
        try{
            task.toInProgress();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void ClosedTaskShouldNotValidation() {
        task.setState(TaskStateClosed.getInstance());
        try{
            task.toValidation();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void ClosedTaskShouldNotDone() {
        task.setState(TaskStateClosed.getInstance());
        try{
            task.done();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void ClosedTaskShouldNotClose() {
        task.setState(TaskStateClosed.getInstance());
        try{
            task.close();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void ClosedTaskShouldNotCancel() {
        task.setState(TaskStateClosed.getInstance());
        try{
            task.cancel();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    // Canceled

    @Test
    public void CanceledTaskShouldNotOpen() {
        task.setState(TaskStateCanceled.getInstance());
        try{
            task.open();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void CanceledTaskShouldNotBacklog() {
        task.setState(TaskStateCanceled.getInstance());
        try{
            task.toBacklog();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void CanceledTaskShouldNotInProgress() {
        task.setState(TaskStateCanceled.getInstance());
        try{
            task.toInProgress();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void CanceledTaskShouldNotValidation() {
        task.setState(TaskStateCanceled.getInstance());
        try{
            task.toValidation();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void CanceledTaskShouldNotDone() {
        task.setState(TaskStateCanceled.getInstance());
        try{
            task.done();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void CanceledTaskShouldNotClose() {
        task.setState(TaskStateCanceled.getInstance());
        try{
            task.close();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

    @Test
    public void CanceledTaskShouldNotCancel() {
        task.setState(TaskStateCanceled.getInstance());
        try{
            task.cancel();
            fail();
        }catch (Exception e){
            assertEquals("Illegal Operation", e.getMessage());
        }
    }

}
