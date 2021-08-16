package FlyWeight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompanyTest {

    @Test
    public void sameCostCenterOnHiring() {
        Company.getInstance().toHire("Gustavo", "SF", "Software Engineering");
        Company.getInstance().toHire("Alberto", "SF", "Software Engineering");

        assertEquals(Company.getEmployees().get(0).getCostCenter(), Company.getEmployees().get(1).getCostCenter());
    }

    @Test
    public void sameCostCenterOnAndOutHiring() {
        Company.getInstance().toHire("Gustavo", "SF", "Software Engineering");

        CostCenter costCenter = new CostCenter("SF", "Software Engineering");

        assertNotEquals(costCenter, Company.getEmployees().get(1).getCostCenter());
    }

    @Test
    public void sameCostCenterOutHiring() {

        CostCenter costCenterOne = new CostCenter("SF", "Software Engineering");
        CostCenter costCenterTwo = new CostCenter("SF", "Software Engineering");

        assertNotEquals(costCenterOne, costCenterTwo);
    }

    @Test
    public void shouldNotDuplicateEntry() {

        Company.getInstance().toHire("Gustavo", "SF", "Software Engineering");
        Company.getInstance().toHire("Alberto", "SF", "Software Engineering");
        Company.getInstance().toHire("Alberto", "QA", "Quality Assurance");

        assertEquals(2, CostCenterFactory.getCostCenters().size());
    }
}
