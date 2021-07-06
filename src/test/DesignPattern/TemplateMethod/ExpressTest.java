package TemplateMethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressTest {

    Express expressOrder;

    @BeforeEach
    public void init(){
        expressOrder = new Express(10L);
    }

    @Test
    public void mustReturnExpress() {
        assertEquals("EXPRESS", expressOrder.getType());
    }

    @Test
    public void mustReturn899() {
        assertEquals(new BigDecimal("8.99"), expressOrder.getPricePerMile());
    }

    @Test
    public void mustReturnPrice(){
        assertEquals(new BigDecimal("89.90"), expressOrder.calculatePrice());
    }

    @Test
    public void mustReturnBudget(){
        assertEquals("EXPRESS order: total $89.90", expressOrder.getBudget());
    }

}
