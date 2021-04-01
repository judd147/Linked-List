package com.company;

public class Point {
    private Double X_coord;                                                                                           //Private members x,y coordinates
    private Double Y_coord;

    Point(Double X_coord, Double Y_coord){                                                                              //Default constructor
        this.X_coord = X_coord;
        this.Y_coord = Y_coord;
    }

    public double distance(){                                                                                         //Calculate distance from origin to the point
        double dist = Math.sqrt(X_coord*X_coord+Y_coord*Y_coord);
        return dist;
    }

    public String toString(){
        return String.format("( %.2f, %.2f )", this.X_coord, this.Y_coord);
    }
}
