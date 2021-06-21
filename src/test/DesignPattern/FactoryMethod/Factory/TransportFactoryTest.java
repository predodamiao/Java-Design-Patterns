package FactoryMethod.Factory;

import FactoryMethod.Model.ITransport;
import FactoryMethod.Model.Teleportation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TransportFactoryTest {
    @Test
    public void getBusTest() {
        ITransport transport = TransportFactory.getTransport("Bus");
        assertEquals("Bus", transport.getClass().getSimpleName());
    }
    @Test
    public void getTrainTest() {
        ITransport transport = TransportFactory.getTransport("Train");
        assertEquals("Train", transport.getClass().getSimpleName());
    }@Test
    public void getTruckTest() {
        ITransport transport = TransportFactory.getTransport("Truck");
        assertEquals("Truck", transport.getClass().getSimpleName());
    }
    @Test
    public void notFoundTransportationTest() {
        try {
            ITransport transport = TransportFactory.getTransport("Boat");
            fail();
        }catch(Exception e){
            assertEquals("Transport Not Found", e.getMessage());
        }

    }
    @Test
    public void invalidTransportationTest() {
        try {
            ITransport transport = TransportFactory.getTransport("Teleportation");
            fail();
        }catch(Exception e){
            assertEquals("Invalid Transport", e.getMessage());
        }

    }
}
