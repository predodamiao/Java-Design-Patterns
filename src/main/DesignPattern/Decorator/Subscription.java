package Decorator;

import java.math.BigDecimal;

public class Subscription implements Product {

    private BigDecimal basePrice;
    private Long usersQuantity;

    public Subscription (BigDecimal basePrice, Long usersQuantity) {
        this.basePrice = basePrice;
        this.usersQuantity = usersQuantity;
    }

    public void setBasePrice (BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public BigDecimal getBasePrice () {
        return basePrice;
    }

    @Override
    public Long getUsersQuantity () {
        return usersQuantity;
    }

    public void setUsersQuantity (Long usersQuantity) {
        this.usersQuantity = usersQuantity;
    }

    @Override
    public BigDecimal getTotalPrice () {
        return basePrice.multiply(new BigDecimal(usersQuantity));
    }

    @Override
    public String getModules () {
        return "Subscription (".concat(usersQuantity.toString()).concat(" users)");
    }
}
