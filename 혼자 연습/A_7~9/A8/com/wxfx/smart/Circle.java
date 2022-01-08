package A8.com.wxfx.smart;     // XXX 잠시 수정

public class Circle {
    double rad;
    final double PI = 3.14;

    public Circle(double r){ rad = r; }
    public double getArea(){ return rad*rad*PI; };
}