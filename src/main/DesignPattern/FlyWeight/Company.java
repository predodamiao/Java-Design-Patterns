package FlyWeight;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private static Company instance;

    private Company () {
    }

    private static List<Employee> employees = new ArrayList<>();

    public static Company getInstance () {
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }

    public void toHire(String nameEmployee, String initialsCostCenter, String nameCostCenter){
        CostCenter costCenter = CostCenterFactory.getCostCenter(initialsCostCenter, nameCostCenter);
        Employee employee = new Employee(nameEmployee, costCenter);
        employees.add(employee);
    }

    public static List<Employee> getEmployees () {
        return employees;
    }
}
