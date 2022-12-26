package com.company;
import java.lang.Math;

public class Sphere extends GeometricBody{
    float R;
    Sphere(float R){
        this.R = R;
    }

    @Override
    public double getSurface(){
        return 4 * Math.PI * R * R;
    }

    @Override
    public double getVolume(){
        return (4 / 3) * Math.PI * R * R * R;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "R = " + R +
                " Surface = " + this.getSurface() +
                " Volume = " + this.getVolume();
    }
}
