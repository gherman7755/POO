package com.company;

public class Main {

    public static void main(String[] args) {
	    // basic
        Cube c = new Cube(5);
        Parallelepiped p = new Parallelepiped(1, 3, 4);
        Sphere s = new Sphere(15);
        GeometricBody arr[] = {c, p, s};

        //medium
        GeometricBodyController gbc = new GeometricBodyController();
        System.out.println(gbc.biggestSurface(arr));
        System.out.println(gbc.biggestVolume(arr));
    }
}
