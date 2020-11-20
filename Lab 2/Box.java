package com.company;

public class Box {
    int height, width, depth;

    public Box(){
        height = depth = width = 1;
    }

    public Box(int h){
        height = depth = width = h;
    }

    public Box(int h, int d, int w){
        height = h;
        depth = d;
        width = w;
    }

    public void surfArea(){
        int S = (height * depth + depth * width + width * height) * 2;
        System.out.println("Surface area: " + S);
    }

    public void volume(){
        int V = width * height * depth;
        System.out.println("Volume: " + V);
    }
}
