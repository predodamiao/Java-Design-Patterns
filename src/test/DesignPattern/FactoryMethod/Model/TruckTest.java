package FactoryMethod.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruckTest {
    @Test
    public void setRouteTest() {
        Truck transport = new Truck();
        assertEquals("Successfully defined truck route", transport.setRoute());
    }

    @Test
    public void goTest() {
        Truck transport = new Truck();
        assertEquals("Going to carry out deliveries by truck", transport.go());
    }

    @Test
    public void cancelTest() {
        Truck transport = new Truck();
        assertEquals("Truck delivery canceled", transport.cancel());
    }
}
