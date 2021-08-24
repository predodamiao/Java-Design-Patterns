package Decorator;

import java.math.BigDecimal;

public class CustomerRelatioshipManagementModule extends Module{

    public CustomerRelatioshipManagementModule (Product product) {
        super(product);
    }

    @Override
    public String getModuleName () {
        return "CRM";
    }

    @Override
    public BigDecimal getBasePrice () {
        if(getUsersQuantity() < 200 && getUsersQuantity() > 0){
            return new BigDecimal(7);
        }else{
            return BigDecimal.ZERO;
        }
    }
}