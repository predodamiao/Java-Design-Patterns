package Decorator;

import java.math.BigDecimal;

public class AccountingModule extends Module{

    public AccountingModule (Product product) {
        super(product);
    }

    @Override
    public String getModuleName () {
        return "Accounting";
    }

    @Override
    public BigDecimal getBasePrice () {
        if(getUsersQuantity() < 10 && getUsersQuantity() > 0){
            return new BigDecimal(10);
        }else if(getUsersQuantity() < 20 ){
            return new BigDecimal(8);
        }else if(getUsersQuantity() < 50 ){
            return new BigDecimal(6);
        }else if(getUsersQuantity() < 100 ){
            return new BigDecimal(4);
        }else if(getUsersQuantity() < 200 ){
            return new BigDecimal(2);
        }else if(getUsersQuantity() < 500 ){
            return new BigDecimal(1);
        }else{
            return BigDecimal.ZERO;
        }
    }
}