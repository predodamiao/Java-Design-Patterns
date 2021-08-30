package AbstractFactory;

public class ProPlanFabric implements PlanFabric{
    @Override
    public Subscription createSubscription () {
        return new ProPlanSubscription();
    }

    @Override
    public TransferRate createTransferRate () {
        return new ProPlanTransferRate();
    }
}
