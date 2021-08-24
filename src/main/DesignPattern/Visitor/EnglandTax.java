package Visitor;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EnglandTax implements Tax {
    @Override
    public BigDecimal calculateTaxFood (Food food) {
        return food.getPrice().add(food.getPrice().multiply(new BigDecimal("0.05"))).setScale(2, RoundingMode.CEILING);
    }

    @Override
    public BigDecimal calculateTaxDrink (Drink drink) {
        return drink.getPrice().add(drink.getPrice().multiply(new BigDecimal("0.3"))).setScale(2, RoundingMode.CEILING);
    }
}