package FactoryMethod.Model;

public class Teleportation {

    public String setRoute() {
        return "Successfully defined teleportation order";
    }

    public String go() {
        return "3...2...1... Orders delivered";
    }

    public String cancel() {
        return "Delivery canceled";
    }
}
