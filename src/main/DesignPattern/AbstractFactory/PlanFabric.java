package AbstractFactory;

public interface PlanFabric {

    Subscription createSubscription();
    TransferRate createTransferRate();
}
