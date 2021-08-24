package Decorator;

import java.math.BigDecimal;

public class FinancialModule extends Module{

    public FinancialModule (Product product) {
        super(product);
    }

    @Override
    public String getModuleName () {
        return "Financial";
    }

    @Override
    public BigDecimal getBasePrice () {
        if(getUsersQuantity() < 10 && getUsersQuantity() > 0){
            return new BigDecimal(35);
        }else if(getUsersQuantity() < 20 ){
            return new BigDecimal(25);
        }else if(getUsersQuantity() < 50 ){
            return new BigDecimal(20);
        }else if(getUsersQuantity() < 100 ){
            return new BigDecimal(15);
        }else if(getUsersQuantity() < 200 ){
            return new BigDecimal(10);
        }else if(getUsersQuantity() < 500 ){
            return new BigDecimal(3);
        }else{
            return BigDecimal.ZERO;
        }
    }
}
