package TemplateMethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EconomicTest {

    Economic economicOrder;

    @BeforeEach
    public void init(){
        economicOrder = new Economic(10L);
    }

    @Test
    public void mustReturnExpress() {
        assertEquals("ECONOMIC", economicOrder.getType());
    }

    @Test
    public void mustReturn399() {
        assertEquals(new BigDecimal("3.99"), economicOrder.getPricePerMile());
    }

    @Test
    public void mustReturnPrice(){
        assertEquals(new BigDecimal("39.90"), economicOrder.calculatePrice());
    }

    @Test
    public void mustReturnBudget(){
        assertEquals("ECONOMIC order: total $39.90", economicOrder.getBudget());
    }

}
