package FactoryMethod.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeleportationTest {
    @Test
    public void setRouteTest() {
        Teleportation transport = new Teleportation();
        assertEquals("Successfully defined teleportation order", transport.setRoute());
    }

    @Test
    public void goTest() {
        Teleportation transport = new Teleportation();
        assertEquals("3...2...1... Orders delivered", transport.go());
    }

    @Test
    public void cancelTest() {
        Teleportation transport = new Teleportation();
        assertEquals("Delivery canceled", transport.cancel());
    }
}
