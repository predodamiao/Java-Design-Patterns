package AbstractFactory;

import java.math.BigDecimal;

public class Client {

    private Subscription subscription;
    private TransferRate transferRate;

    public Client (PlanFabric fabric) {
        this.subscription = fabric.createSubscription();
        this.transferRate = fabric.createTransferRate();
    }

    public BigDecimal getTransferRate (BigDecimal value){
        return this.transferRate.calculateValue(value);
    }

    public BigDecimal getSubscriptionValue(){
        return this.subscription.getValue();
    }
}
