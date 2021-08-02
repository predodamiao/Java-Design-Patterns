package Facade;

import java.math.BigDecimal;

public class Advance {

    public static void calculate(Employee e) {
        if(e.getAdvancePaymentOpt()){
            e.setBaseSalary(e.getBaseSalary().multiply(new BigDecimal(0.6)));
        }
    }

}
