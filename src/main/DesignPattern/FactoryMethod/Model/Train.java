package FactoryMethod.Model;

public class Train implements ITransport{
    @Override
    public String setRoute() {
        return "Successfully defined train route";
    }

    @Override
    public String go() {
        return "Going to carry out deliveries by train";
    }

    @Override
    public String cancel() {
        return "Train delivery canceled";
    }
}
