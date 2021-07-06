package TemplateMethod;

import java.math.BigDecimal;

public class Economic extends Order{

    public Economic (Long distance){
        super(distance);
    }

    public BigDecimal getPricePerMile(){
        return new BigDecimal("3.99").setScale(2);
    }

    public String getType(){
        return "ECONOMIC";
    }

}

