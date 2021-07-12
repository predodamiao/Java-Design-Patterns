package Observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void shouldNotifyPerson() {
        ServiceQueue queue = new ServiceQueue();
        Client client = new Client("Juliana");
        client.enterQueue(queue);
        assertEquals(client.getPositionInQueue(), 1);
        queue.next();
        assertNull(client.getPositionInQueue());
    }

    @Test
    public void shouldNotifyPeople() {
        ServiceQueue queue = new ServiceQueue();
        Client juliana = new Client("Juliana");
        juliana.enterQueue(queue);
        Client gabriel = new Client("Gabriel");
        gabriel.enterQueue(queue);

        assertEquals(juliana.getPositionInQueue(), 1);
        assertEquals(gabriel.getPositionInQueue(), 2);

        queue.next();

        assertNull(juliana.getPositionInQueue());
        assertEquals(gabriel.getPositionInQueue(), 1);
    }

    @Test
    public void shouldNotifyJustOnePerson() {
        ServiceQueue queue = new ServiceQueue();
        Client juliana = new Client("Juliana");
        juliana.enterQueue(queue);
        Client gabriel = new Client("Gabriel");

        assertEquals(juliana.getPositionInQueue(), 1);
        assertNull(gabriel.getPositionInQueue());

        queue.next();

        assertNull(juliana.getPositionInQueue());
        assertNull(gabriel.getPositionInQueue());
    }
}
