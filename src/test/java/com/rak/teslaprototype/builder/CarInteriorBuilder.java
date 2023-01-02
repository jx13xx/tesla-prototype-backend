package com.rak.teslaprototype.builder;

import com.rak.teslaprototype.defaultData.DefaultCar;
import com.rak.teslaprototype.defaultData.DefaultCarInterior;
import com.rak.teslaprototype.model.CarInterior;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarInteriorBuilder {
    long id = new Random().nextLong();
    long id2 = new Random().nextLong();
    String description = DefaultCarInterior.Description;
    String color = "fewfwe";
    String description2 = DefaultCarInterior.Description;
    boolean option_included = false;
    Integer price = DefaultCarInterior.price;

    public List<CarInterior> build() {
        CarInterior carInterior1 = new CarInterior(id, description, color, true, price);
        CarInterior carInterior2 = new CarInterior(id2, description,color, true, price);
        List<CarInterior> carInteriors = new ArrayList<>();
        carInteriors.add(carInterior1);
        carInteriors.add(carInterior2);
        return carInteriors;

    }
}
