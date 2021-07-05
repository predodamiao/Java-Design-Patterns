package Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FleetTest {

    Fleet fleet;

    @BeforeEach
    public void init(){
        fleet = new Fleet();
        fleet.addVehicle(
                new Car("BMW 320i", new BigDecimal("253000")),
                new Truck("Volvo FH 540", new BigDecimal("668000")),
                new Car("Mercedes C180", new BigDecimal("237900")),
                new Truck("Scania R 450", new BigDecimal("599000")),
                new Car("Audi R8", new BigDecimal("1530000")),
                new Truck("Volvo FH 460", new BigDecimal("549000")),
                new Car("DODGE RAM 2500", new BigDecimal("376990"))
        );
    }


    @Test
    public void totalPriceTest() {

        assertEquals(new BigDecimal("4213890.00"), Report.getTotalValueFleet(fleet));
    }

    @Test
    public void totalQuantityTest() {

        assertEquals(7, Report.getTotalQuantityFleet(fleet));
    }
}
