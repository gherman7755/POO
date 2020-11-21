package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	// first
	    Square sq = new Square(2);
	    Rectangle rec = new Rectangle(7, 5);
	    Triangle tri = new Triangle(5, 6, 7);
	    Figure figures[] = {sq, rec, tri};
	    // second
		ArrayList<Figure> figs = new ArrayList<Figure>();
		figs.add(sq);
		figs.add(rec);
		figs.add(tri);
		FigureController fg = new FigureController();
		System.out.println(fg.biggestArea(figs));
		System.out.println(fg.biggestPerimeter(figs));
    }
}
