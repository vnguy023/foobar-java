package com.lighttech.features;

public class FeatureBase {
    public FeatureBase() {
        System.out.println(String.format("Hello from %s!", this.getClass().getSimpleName()));
    }
}
