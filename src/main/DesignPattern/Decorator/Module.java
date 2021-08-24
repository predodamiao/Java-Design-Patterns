package Decorator;

import java.math.BigDecimal;

public abstract class Module implements Product {

    protected Product product;

    public Module (Product product) {
        this.product = product;
    }

    public abstract String getModuleName ();

    @Override
    public abstract BigDecimal getBasePrice ();

    @Override
    public BigDecimal getTotalPrice () {
        return product.getTotalPrice()
                .add(
                        getBasePrice().multiply(new BigDecimal(product.getUsersQuantity()))
                );
    }

    @Override
    public String getModules () {
        return product.getModules()
                .concat(" | ")
                .concat(getModuleName());
    }

    @Override
    public Long getUsersQuantity () {
        return product.getUsersQuantity();
    }
}
