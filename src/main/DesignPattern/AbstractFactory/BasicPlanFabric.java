package AbstractFactory;

public class BasicPlanFabric implements PlanFabric{
    @Override
    public Subscription createSubscription () {
        return new BasicPlanSubscription();
    }

    @Override
    public TransferRate createTransferRate () {
        return new BasicPlanTransferRate();
    }
}
