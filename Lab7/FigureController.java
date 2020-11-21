package com.company;

import java.util.ArrayList;

public class FigureController {
    public Figure biggestArea(ArrayList<Figure> figs){
        float max = 0f;
        Figure max_f = null;
        for(Figure f : figs){
            if(max < f.getArea()){
                max = f.getArea();
                max_f = f;
            }
        }
        return max_f;
    }

    public Figure biggestPerimeter(ArrayList<Figure> figs){
        float max = 0f;
        Figure max_f = null;
        for(Figure f : figs){
            if(max < f.getPerimeter()){
                max = f.getPerimeter();
                max_f = f;
            }
        }
        return max_f;
    }
}
