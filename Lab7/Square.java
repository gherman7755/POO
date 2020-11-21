package com.company;

public class Square extends Figure{
    private float a;

    Square(float a){
        super(a);
        this.a = a;
    }

    public float getArea() {
        return a * a;
    }

    public float getPerimeter() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return "Square\n" + "Area: " + this.getArea() +
                ", Perimeter" + this.getPerimeter();
    }
}
