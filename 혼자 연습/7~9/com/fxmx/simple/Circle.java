package com.fxmx.simple;

public class Circle {
    double rad;
    final double PI=3.14;

    public Circle(double r){
        rad=r;
    }

    public double getPerimeter(){
        return 2 * rad * PI;
    }
}