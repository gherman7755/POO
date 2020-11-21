package com.company;

public class Rectangle extends Figure{
    private float width;
    private float height;

    Rectangle(float width, float height){
        super(width, height);
        this.width = width;
        this.height = height;
    }

    public float getPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle\n" + "Area: " + this.getArea() +
                ", Perimeter: " + this.getPerimeter();
        }
}
