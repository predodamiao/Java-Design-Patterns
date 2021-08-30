package AbstractFactory;

import java.math.BigDecimal;

public class ProPlanSubscription implements Subscription{
    @Override
    public BigDecimal getValue () {
        return new BigDecimal("50.00");
    }
}
