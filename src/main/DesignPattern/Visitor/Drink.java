package Visitor;

import java.math.BigDecimal;

public class Drink implements Product {

    private String brand;
    private Integer quantity;
    private BigDecimal price;

    public Drink (String brand, Integer quantity, BigDecimal price) {
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    public String getBrand () {
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public Integer getQuantity () {
        return quantity;
    }

    public void setQuantity (Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice () {
        return price;
    }

    public void setPrice (BigDecimal price) {
        this.price = price;
    }

    @Override
    public BigDecimal accept (Tax tax) {
        return tax.calculateTaxDrink(this);
    }
}
