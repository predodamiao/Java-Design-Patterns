package Facade;

import java.math.BigDecimal;

public class PersonalDepartment {

    public static void calculateSalary(Employee e){

        BigDecimal pension = Pension.calculate(e);

        BigDecimal incomeTax = IncomeTax.calculate(e, pension);

        Advance.calculate(e);

        e.setSalary(e.getBaseSalary().subtract(pension).subtract(incomeTax));

    }

}
