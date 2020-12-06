package com.company;

public class Cube extends GeometricBody{
    float a;

    Cube(float a){
        this.a = a;
    }

    @Override
    public double getSurface(){
        return this.a * this.a * 6;
    }

    @Override
    public double getVolume(){
        return this.a * this.a * this.a;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "a = " + this.a +
                " Surface = " + this.getSurface() +
                " Volume = " + this.getVolume();
    }
}
