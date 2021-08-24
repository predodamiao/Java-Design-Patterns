package Visitor;

import java.math.BigDecimal;

public interface Product {
    BigDecimal accept(Tax tax);
}
