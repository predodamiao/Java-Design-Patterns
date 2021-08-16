package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class CostCenterFactory {

    private static Map<String, CostCenter> costCenters = new HashMap<>();

    public static CostCenter getCostCenter(String name, String initials){
        CostCenter costCenter = costCenters.get(initials);
        if(costCenter == null){
            costCenter = new CostCenter(initials, name);
            costCenters.put(initials, costCenter);
        }
        return costCenter;
    }

    public static Map<String, CostCenter> getCostCenters () {
        return costCenters;
    }
}
