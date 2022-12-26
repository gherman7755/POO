package com.company;

public class Monitor {
    public float resolution;
    public String color;
    public String dimensions;

    void displayInfo() {
        System.out.printf("Color: %s\tResolution: %f\tDimensions: %s", color, resolution, dimensions);
    }
}
