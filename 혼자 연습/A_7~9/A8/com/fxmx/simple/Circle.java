package A8.com.fxmx.simple;     // XXX 잠시 수정

public class Circle{
    double rad;
    final double PI = 3.14;

    public Circle(double r){ rad = r; }
    public double getPerimeter(){ return 2*PI*rad; };
}