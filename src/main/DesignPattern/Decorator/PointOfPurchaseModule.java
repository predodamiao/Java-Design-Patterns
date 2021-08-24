package Decorator;

import java.math.BigDecimal;

public class PointOfPurchaseModule extends Module{

    public PointOfPurchaseModule (Product product) {
        super(product);
    }

    @Override
    public String getModuleName () {
        return "POP";
    }

    @Override
    public BigDecimal getBasePrice () {
        if(getUsersQuantity() < 100 && getUsersQuantity() > 0){
            return new BigDecimal(30);
        }else if(getUsersQuantity() < 500){
            return new BigDecimal(10);
        }else{
            return BigDecimal.ZERO;
        }
    }
}
