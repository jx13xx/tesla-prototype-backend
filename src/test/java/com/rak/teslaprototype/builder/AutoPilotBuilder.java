package com.rak.teslaprototype.builder;

import com.rak.teslaprototype.defaultData.DefaultAutoPilot;
import com.rak.teslaprototype.model.AutoPilot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AutoPilotBuilder {
    Long id1 = new Random().nextLong();
    Long id2 = new Random().nextLong();
    String description = DefaultAutoPilot.Description;
    String description2 = DefaultAutoPilot.Description2;
    String price1 = DefaultAutoPilot.Price;
    String price2 = DefaultAutoPilot.Price2;

    public List<AutoPilot> build(){
        AutoPilot autoPilot1 = new AutoPilot(id1, description, price1);
        AutoPilot autoPilot2 = new AutoPilot(id2, description2, price2);

        List<AutoPilot> autoPilots = new ArrayList<>();
        autoPilots.add(autoPilot1);
        autoPilots.add(autoPilot2);
        return autoPilots;
    }
}
