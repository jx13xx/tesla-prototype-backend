package com.rak.teslaprototype.builder;

import com.rak.teslaprototype.defaultData.DefaultCost;
import com.rak.teslaprototype.model.Cost;

import java.util.Random;

public class CostBuilder {
    Long id = new Random().nextLong();
    String currency = DefaultCost.Currency;
    Integer price = DefaultCost.Price;

    public Cost build(){
        return new Cost(id, currency, price);
    }



}
