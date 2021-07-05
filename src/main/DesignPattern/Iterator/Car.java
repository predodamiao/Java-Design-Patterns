package Iterator;

import java.math.BigDecimal;

public class Car implements IVehicle{

    private String model;
    private BigDecimal price;

    public Car (String model, BigDecimal price) {
        this.model = model;
        this.price = price;
    }

    public String getModel () {
        return model;
    }

    public Car setModel (String model) {
        this.model = model;
        return this;
    }

    public BigDecimal getPrice () {
        return price;
    }

    public Car setPrice (BigDecimal price) {
        this.price = price;
        return this;
    }
}
