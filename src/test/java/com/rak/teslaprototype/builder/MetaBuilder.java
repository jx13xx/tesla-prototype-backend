package com.rak.teslaprototype.builder;

import com.rak.teslaprototype.defaultData.DefaultMeta;
import com.rak.teslaprototype.model.Meta;

import java.util.Random;

public class MetaBuilder {
    Long id = new Random().nextLong();
    String imageUrl = DefaultMeta.ImageUrl;
    String bannerColor = DefaultMeta.BannerColor;

    public Meta build(){
        return new Meta(id, imageUrl, bannerColor);
    }
}
