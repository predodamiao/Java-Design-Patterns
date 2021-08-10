package Mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RouterTest {
    @Test
    public void testBroadcast() {
        Router router = new Router("Tenda AC10");
        Equipment e1 = new Equipment("A1:10:20:E4:C6:V7");
        e1.connect(router);
        e1.setOn(true);
        Equipment e2 = new Equipment("A1:10:30:40:M7:MM");
        e2.connect(router);
        e2.setOn(true);
        Equipment e3 = new Equipment("A1:10:V8:V8:B7:HH");
        e3.connect(router);
        e3.setOn(true);
        Equipment e4 = new Equipment("A1:10:F0:ER:C9:27");
        e4.connect(router);

        router.broadcast(e2, "BroadcastTest");

        assertEquals("A1:10:30:40:M7:MM: BroadcastTest", e1.getLastMessage());
        assertNull(e2.getLastMessage());
        assertEquals("A1:10:30:40:M7:MM: BroadcastTest", e3.getLastMessage());
        assertNull(e4.getLastMessage());

    }
}
