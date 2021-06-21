package FactoryMethod.Model;

public class Truck implements ITransport{
    @Override
    public String setRoute() {
        return "Successfully defined truck route";
    }

    @Override
    public String go() {
        return "Going to carry out deliveries by truck";
    }

    @Override
    public String cancel() {
        return "Truck delivery canceled";
    }
}
