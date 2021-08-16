package FlyWeight;

public class Employee {

    private String name;
    private CostCenter costCenter;

    public Employee (String name, CostCenter costCenter) {
        this.name = name;
        this.costCenter = costCenter;
    }

    public String getName () {
        return name;
    }

    public Employee setName (String name) {
        this.name = name;
        return this;
    }

    public CostCenter getCostCenter () {
        return costCenter;
    }

    public Employee setCostCenter (CostCenter costCenter) {
        this.costCenter = costCenter;
        return this;
    }
}
