package FactoryMethod.Model;

public class Bus implements ITransport{
    @Override
    public String setRoute() {
        return "Successfully defined bus route";
    }

    @Override
    public String go() {
        return "Going to carry out deliveries by bus";
    }

    @Override
    public String cancel() {
        return "Bus delivery canceled";
    }
}
