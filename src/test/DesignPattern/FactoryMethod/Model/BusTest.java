package FactoryMethod.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusTest {
    @Test
    public void setRouteTest() {
        Bus transport = new Bus();
        assertEquals("Successfully defined bus route", transport.setRoute());
    }

    @Test
    public void goTest() {
        Bus transport = new Bus();
        assertEquals("Going to carry out deliveries by bus", transport.go());
    }

    @Test
    public void cancelTest() {
        Bus transport = new Bus();
        assertEquals("Bus delivery canceled", transport.cancel());
    }
}
