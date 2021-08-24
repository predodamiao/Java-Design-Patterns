package Visitor;

import java.math.BigDecimal;

public class Food implements Product {

    private String brand;
    private Integer weight;
    private BigDecimal price;

    public Food (String brand, Integer weight, BigDecimal price) {
        this.brand = brand;
        this.weight = weight;
        this.price = price;
    }

    public String getBrand () {
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public Integer getWeight () {
        return weight;
    }

    public void setWeight (Integer weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice () {
        return price;
    }

    public void setPrice (BigDecimal price) {
        this.price = price;
    }

    @Override
    public BigDecimal accept (Tax tax) {
        return tax.calculateTaxFood(this);
    }
}
