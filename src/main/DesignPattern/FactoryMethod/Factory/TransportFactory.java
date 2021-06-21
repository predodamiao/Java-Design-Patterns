package FactoryMethod.Factory;

import FactoryMethod.Model.ITransport;

public class TransportFactory {

    public static ITransport getTransport(String service) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("FactoryMethod.Model." + service);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Transport Not Found");
        }
        if (!(objeto instanceof ITransport)) {
            throw new IllegalArgumentException("Invalid Transport");
        }
        return (ITransport) objeto;
    }
}