package com.rak.teslaprototype.builder;

import com.rak.teslaprototype.defaultData.DefaultCost;
import com.rak.teslaprototype.defaultData.DefaultFeature;
import com.rak.teslaprototype.model.Cost;
import com.rak.teslaprototype.model.Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FeatureBuilder {
    Long id = new Random().nextLong();
    String Feature = DefaultFeature.Feature;
    Integer price = DefaultFeature.Price;

    Long id2 = new Random().nextLong();
    String Feature2 = DefaultFeature.Feature2;
    Integer price2 = DefaultFeature.Price2;


    public List<com.rak.teslaprototype.model.Feature> build(){
        com.rak.teslaprototype.model.Feature feature1 = new Feature(id, Feature, price);
        com.rak.teslaprototype.model.Feature feature2 = new Feature(id2, Feature2,price2);
        List<Feature> listFeatures = new ArrayList<>();
        listFeatures.add(feature1);
        listFeatures.add(feature2);
        return listFeatures;
    }
}
