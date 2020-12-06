package com.company;

public class Parallelepiped extends GeometricBody{
    float a;
    float b;
    float c;

    Parallelepiped(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSurface(){
        return 2 * (a * b + b * c + c * a);
    }

    @Override
    public double getVolume() {
        return a * b * c;
    }

    @Override
    public String
    toString() {
        return "Parallelepiped{" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                " Surface = " + this.getSurface() +
                " Volume = " + this.getVolume();
    }
}
