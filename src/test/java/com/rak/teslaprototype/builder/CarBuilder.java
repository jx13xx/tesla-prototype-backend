package com.rak.teslaprototype.builder;

import com.rak.teslaprototype.defaultData.DefaultCar;
import com.rak.teslaprototype.model.*;

import java.util.List;
import java.util.Random;

public class CarBuilder {
    Long id = new Random().nextLong();
    String modelName = DefaultCar.ModelName;
    Integer price = DefaultCar.Price;
    Cost cost = new CostBuilder().build();
    Meta meta = new MetaBuilder().build();
    List<Feature> features = new FeatureBuilder().build();
    List<CarInterior> carInteriors = new CarInteriorBuilder().build();
    List<Color> colors = new ColorBuilder().build();
    List<AutoPilot> autoPilots = new AutoPilotBuilder().build();




    public Car build() {
        return new Car(id, modelName, price, cost, meta, features,carInteriors,colors,autoPilots);
    }

    public CarBuilder cost(Cost cost){
        this.cost = cost;
        return this;
    }
    public CarBuilder meta (Meta meta){
        this.meta = meta;
        return this;
    }
    public CarBuilder feature(List<Feature> features){
        this.features = features;
        return this;
    }

    public CarBuilder carInterior(List<CarInterior> carInteriors){
        this.carInteriors = carInteriors;
        return this;
    }

    public CarBuilder colors (List<Color> colors){
        this.colors = colors;
        return this;
    }

    public CarBuilder autopilot (List<AutoPilot> autoPilot){
        this.autoPilots = autoPilot;
        return this;
    }
}
