package com.wxfx.smart;

// public 꼭 써주기

public class Circle {
    double rad;
    final double PI=3.14;

    public Circle(double r){
        rad=r;
    }

    public double getArea(){
        return rad * rad * PI;
    }
    
}
