package FactoryMethod.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainTest {
    @Test
    public void setRouteTest() {
        Train transport = new Train();
        assertEquals("Successfully defined train route", transport.setRoute());
    }

    @Test
    public void goTest() {
        Train transport = new Train();
        assertEquals("Going to carry out deliveries by train", transport.go());
    }

    @Test
    public void cancelTest() {
        Train transport = new Train();
        assertEquals("Train delivery canceled", transport.cancel());
    }
}
