package com.company;

import java.lang.Math;

public class Triangle extends Figure {
    float a;
    float b;
    float c;

    Triangle(float a, float b, float c){
        super(a,b,c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getArea() {
        float p = getPerimeter() / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    public float getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle\n" + "Area: " + this.getArea() +
                ", Perimeter: " + this.getPerimeter();
    }
}
