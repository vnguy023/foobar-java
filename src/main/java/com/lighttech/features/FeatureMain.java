package com.lighttech.features;

import com.lighttech.features.fileio.FeatureFileIO;

public class FeatureMain {
    public FeatureMain() {
        System.out.println(String.format("Hello from %s!", this.getClass().getSimpleName()));

        FeatureFileIO featureFileIO = new FeatureFileIO();
    }
}
