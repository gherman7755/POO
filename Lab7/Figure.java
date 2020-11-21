package com.company;

public abstract class Figure {
    float a;
    float b;
    float c;

    Figure(float a){
        this.a = a;
    }

    Figure(float a, float b){
        this.a = a;
        this.b = b;
    }

    Figure(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public abstract float getArea();
    public abstract float getPerimeter();
}
