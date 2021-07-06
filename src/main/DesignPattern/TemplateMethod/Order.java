package TemplateMethod;

import java.math.BigDecimal;

public abstract class Order {

    public Order(Long distance){
        this.distance = distance;
    }

    private Long distance;

    public Long getDistance () {
        return distance;
    }

    public Order setDistance (Long distance) {
        this.distance = distance;
        return this;
    }

    public abstract BigDecimal getPricePerMile();

    public BigDecimal calculatePrice(){
        return this.getPricePerMile().multiply((BigDecimal.valueOf(this.getDistance()).setScale(2))).setScale(2);
    }

    public abstract String getType();

    public String getBudget(){
        return this.getType() + " order: total $" + this.calculatePrice().toString();
    }
}
