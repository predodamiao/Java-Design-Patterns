package Iterator;

import java.math.BigDecimal;

public class Truck implements IVehicle{
    private String model;
    private BigDecimal price;

    public Truck (String model, BigDecimal price) {
        this.model = model;
        this.price = price;
    }

    public String getModel () {
        return model;
    }

    public Truck setModel (String model) {
        this.model = model;
        return this;
    }

    public BigDecimal getPrice () {
        return price;
    }

    public Truck setPrice (BigDecimal price) {
        this.price = price;
        return this;
    }
}
