package Visitor;

import java.math.BigDecimal;

public interface Tax {

    BigDecimal calculateTaxFood(Food food);
    BigDecimal calculateTaxDrink(Drink drink);

}
