package Facade;

import java.math.BigDecimal;



public class Pension {

    private static final BigDecimal FIRST_GROUP = new BigDecimal("1100");

    private static final BigDecimal SECOND_GROUP = new BigDecimal("2203.48");

    private static final BigDecimal THIRD_GROUP = new BigDecimal("3305.22");

    private static final BigDecimal FIRST_LANE_ALIQUOT = new BigDecimal("0.075");
    private static final BigDecimal SECOND_LANE_ALIQUOT = new BigDecimal("0.09");
    private static final BigDecimal THIRD_LANE_ALIQUOT = new BigDecimal("0.12");
    private static final BigDecimal FORTY_LANE_ALIQUOT = new BigDecimal("0.14");

    private static final BigDecimal CEILING = new BigDecimal("6433.57");

    public static BigDecimal calculate(Employee e) {
        BigDecimal discount = BigDecimal.ZERO;

        BigDecimal salary = e.getBaseSalary();

        if(salary.compareTo(CEILING) > 0){
            salary = CEILING;
        }

        BigDecimal fortyLane = salary.subtract(THIRD_GROUP);

        if(fortyLane.compareTo(BigDecimal.ZERO) > 0){
            discount = discount.add(fortyLane.multiply(FORTY_LANE_ALIQUOT));
            salary = salary.subtract(fortyLane);
        }

        BigDecimal thirdLane = salary.subtract(SECOND_GROUP);

        if(thirdLane.compareTo(BigDecimal.ZERO) > 0){
            discount = discount.add(thirdLane.multiply(THIRD_LANE_ALIQUOT));
            salary = salary.subtract(thirdLane);
        }

        BigDecimal secondLane = salary.subtract(FIRST_GROUP);

        if(secondLane.compareTo(BigDecimal.ZERO) > 0){
            discount = discount.add(secondLane.multiply(SECOND_LANE_ALIQUOT));
            salary = salary.subtract(secondLane);
        }

        BigDecimal firstLane = salary;

        if(firstLane.compareTo(BigDecimal.ZERO) > 0){
            discount = discount.add(firstLane.multiply(FIRST_LANE_ALIQUOT));
        }

        return discount;

    }
}
