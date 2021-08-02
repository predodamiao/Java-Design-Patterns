package Facade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonalDepartmentTest {

    Employee e;

    @BeforeEach
    public void init(){
        e = new Employee();
        e.setName("João");
    }

    @Test
    public void testSalaryWithIncomeAndPensionAndNoDependents() {
        e.setBaseSalary(new BigDecimal(2487));
        e.setAdvancePaymentOpt(true);
        e.setDependentsQuantity(0);
        PersonalDepartment.calculateSalary(e);
        assertEquals(new BigDecimal("1248.82"), e.getSalary().setScale(2, RoundingMode.FLOOR));
    }

    @Test
    public void testSalaryWithIncomeAndPensionAndTwoDependents() {
        e.setBaseSalary(new BigDecimal(2487));
        e.setAdvancePaymentOpt(false);
        e.setDependentsQuantity(2);
        PersonalDepartment.calculateSalary(e);
        assertEquals(new BigDecimal("2271.16"), e.getSalary().setScale(2, RoundingMode.FLOOR));
    }

    @Test
    public void testSalaryMinimal() {
        e.setBaseSalary(new BigDecimal(1100));
        e.setAdvancePaymentOpt(true);
        e.setDependentsQuantity(2);
        PersonalDepartment.calculateSalary(e);
        assertEquals(new BigDecimal("577.49"), e.getSalary().setScale(2, RoundingMode.FLOOR));
    }


}
