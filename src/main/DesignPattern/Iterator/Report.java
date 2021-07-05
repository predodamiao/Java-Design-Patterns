package Iterator;

import java.math.BigDecimal;

public class Report {
    public static BigDecimal getTotalValueFleet(Fleet fleet){
        BigDecimal total = BigDecimal.ZERO;
        for(IVehicle vehicle : fleet){
            total = total.add(vehicle.getPrice());
        }
        return total.setScale(2);
    }

    public static Integer getTotalQuantityFleet(Fleet fleet){
        Integer total = 0;
        for(IVehicle vehicle : fleet){
            total++;
        }
        return total;
    }

}
