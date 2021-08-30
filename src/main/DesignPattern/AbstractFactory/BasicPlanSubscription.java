package AbstractFactory;

import java.math.BigDecimal;

public class BasicPlanSubscription implements Subscription{
    @Override
    public BigDecimal getValue () {
        return new BigDecimal("25.00");
    }
}
