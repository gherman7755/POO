package com.company;

public class GeometricBodyController {
    public GeometricBody biggestVolume(GeometricBody[] a){
        double max = 0;
        GeometricBody max_el = null;
        for(GeometricBody el : a){
            if(max < el.getVolume()){
                max = el.getVolume();
                max_el = el;
            }
        }
        return max_el;
    }

    public GeometricBody biggestSurface(GeometricBody[] a){
        double max = 0;
        GeometricBody max_el = null;
        for(GeometricBody el : a){
            if(max < el.getSurface()){
                max = el.getSurface();
                max_el = el;
            }
        }
        return max_el;
    }
}
