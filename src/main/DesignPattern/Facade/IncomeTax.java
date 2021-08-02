package Facade;

import java.math.BigDecimal;

public class IncomeTax {

    private static final BigDecimal DEDUCTION_PER_DEPENDENT = new BigDecimal("189.59");

    private static final BigDecimal FIRST_GROUP = new BigDecimal("2826.65");
    private static final BigDecimal SECOND_GROUP = new BigDecimal("3751.05");
    private static final BigDecimal THIRD_GROUP = new BigDecimal("4664.68");

    private static final BigDecimal FIRST_LANE_ALIQUOT = new BigDecimal("0.075");
    private static final BigDecimal SECOND_LANE_ALIQUOT = new BigDecimal("0.15");
    private static final BigDecimal THIRD_LANE_ALIQUOT = new BigDecimal("0.225");
    private static final BigDecimal FORTY_LANE_ALIQUOT = new BigDecimal("0.275");

    private static final BigDecimal FIRST_LANE_DEDUCTION = new BigDecimal("142.80");
    private static final BigDecimal SECOND_LANE_DEDUCTION = new BigDecimal("354.80");
    private static final BigDecimal THIRD_LANE_DEDUCTION = new BigDecimal("626.13");
    private static final BigDecimal FORTY_LANE_ADEDUCTION = new BigDecimal("869.36");

    private static final BigDecimal CEILING = new BigDecimal("1903.98");

    public static BigDecimal calculate(Employee e, BigDecimal p) {

        BigDecimal salary = e.getBaseSalary().subtract(p);
        salary = salary.subtract((DEDUCTION_PER_DEPENDENT.multiply(new BigDecimal(e.getDependentsQuantity()))));

        if(salary.compareTo(CEILING) < 0){
            return BigDecimal.ZERO;
        }

        if(salary.compareTo(FIRST_GROUP) < 0){
            return salary.multiply(FIRST_LANE_ALIQUOT).subtract(FIRST_LANE_DEDUCTION);
        }else if(salary.compareTo(SECOND_GROUP) < 0){
            return salary.multiply(SECOND_LANE_ALIQUOT).subtract(SECOND_LANE_DEDUCTION);
        }else if(salary.compareTo(THIRD_GROUP) < 0){
            return salary.multiply(THIRD_LANE_ALIQUOT).subtract(THIRD_LANE_DEDUCTION);
        }else{
            return salary.multiply(FORTY_LANE_ALIQUOT).subtract(FORTY_LANE_ADEDUCTION);
        }

    }
}
