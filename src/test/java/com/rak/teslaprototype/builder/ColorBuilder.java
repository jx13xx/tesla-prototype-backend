package com.rak.teslaprototype.builder;

import com.rak.teslaprototype.defaultData.DefaultColor;
import com.rak.teslaprototype.model.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ColorBuilder {
    Long id = new Random().nextLong();
    Long id2 = new Random().nextLong();
    String color = DefaultColor.ColorName;
    String color2 = DefaultColor.ColorName2;
    String colorValue = DefaultColor.ColorValue;
    String colorValue2= DefaultColor.ColorValue2;
    String price = DefaultColor.Price;
    String price2 = DefaultColor.Price2;
    boolean baseColor = DefaultColor.BaseColor;
    boolean baseColor2 = DefaultColor.BaseColor2;

    public List<Color> build(){
        Color color1 = new Color(id, color, colorValue, price, baseColor);
        Color color2 = new Color(id2, color, colorValue2, price2, baseColor2);
        List<Color> colors = new ArrayList<>();

        colors.add(color1);
        colors.add(color2);
        return colors;
    }
}
