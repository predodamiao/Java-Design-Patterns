package Facade;

import java.math.BigDecimal;

public class Employee {

    private String name;
    private BigDecimal baseSalary;
    private BigDecimal salary;
    private Boolean AdvancePaymentOpt;
    private Integer dependentsQuantity;

    public String getName () {
        return name;
    }

    public Employee setName (String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getBaseSalary () {
        return baseSalary;
    }

    public Employee setBaseSalary (BigDecimal baseSalary) {
        this.baseSalary = baseSalary;
        return this;
    }

    public BigDecimal getSalary () {
        return salary;
    }

    public Employee setSalary (BigDecimal salary) {
        this.salary = salary;
        return this;
    }

    public Boolean getAdvancePaymentOpt () {
        return AdvancePaymentOpt;
    }

    public Employee setAdvancePaymentOpt (Boolean advancePaymentOpt) {
        AdvancePaymentOpt = advancePaymentOpt;
        return this;
    }

    public Integer getDependentsQuantity () {
        return dependentsQuantity;
    }

    public Employee setDependentsQuantity (Integer dependentsQuantity) {
        this.dependentsQuantity = dependentsQuantity;
        return this;
    }
}
