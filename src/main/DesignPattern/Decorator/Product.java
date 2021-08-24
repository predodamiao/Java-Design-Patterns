package Decorator;

import java.math.BigDecimal;

public interface Product {

    String getModules();
    Long getUsersQuantity();
    BigDecimal getBasePrice();
    BigDecimal getTotalPrice ();

}
