package TemplateMethod;

import java.math.BigDecimal;

public class Express extends Order{

    public Express (Long distance){
        super(distance);
    }

    public BigDecimal getPricePerMile(){
        return new BigDecimal("8.99").setScale(2);
    }

    public String getType(){
        return "EXPRESS";
    }

}
