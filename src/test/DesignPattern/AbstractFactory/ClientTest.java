package AbstractFactory;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClientTest {

    Client client;

    @Test
    public void basicPlanTransferRate() {
        PlanFabric fabric = new BasicPlanFabric();
        client = new Client(fabric);

        assertEquals(new BigDecimal("300.00"), client.getTransferRate(new BigDecimal("1000")));
    }

    @Test
    public void basicPlanTSubscription() {
        PlanFabric fabric = new BasicPlanFabric();
        client = new Client(fabric);

        assertEquals(new BigDecimal("25.00"), client.getSubscriptionValue());
    }

    @Test
    public void ProPlanTransferRate() {
        PlanFabric fabric = new ProPlanFabric();
        client = new Client(fabric);

        assertEquals(new BigDecimal("100.00"), client.getTransferRate(new BigDecimal("1000")));
    }

    @Test
    public void ProPlanTSubscription() {
        PlanFabric fabric = new ProPlanFabric();
        client = new Client(fabric);

        assertEquals(new BigDecimal("50.00"), client.getSubscriptionValue());
    }
}
