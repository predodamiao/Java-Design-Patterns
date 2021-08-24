package Visitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    Product blueberry;
    Product milk;

    Tax usa;
    Tax england;

    @BeforeEach
    public void init(){
        blueberry = new Food("Blueberry", 150, new BigDecimal(25));
        milk = new Drink("Milk", 1000, new BigDecimal(3));

        usa = new USATax();
        england = new EnglandTax();
    }

    @Test
    public void testDrinkTaxInUSA(){
        assertEquals(new BigDecimal("3.60"),milk.accept(usa));
    }

    @Test
    public void testFoodTaxInUSA(){
        assertEquals(new BigDecimal("27.50"),blueberry.accept(usa));
    }
    @Test
    public void testDrinkTaxInEngland(){
        assertEquals(new BigDecimal("3.90"),milk.accept(england));
    }
    @Test
    public void testFoodTaxInEngland(){
        assertEquals(new BigDecimal("26.25"),blueberry.accept(england));
    }
}
