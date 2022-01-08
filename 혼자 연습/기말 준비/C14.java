interface Shape {
    double getArea();
    String getName();
}

class Circle2 implements Shape {
    private String name;
    private double radius;
    
    public Circle2(String s, double r) { name = s; radius = r; }
    @Override
    public double getArea() { return radius * radius * 3.14; }
    @Override
    public String getName() { return name; }
}

class Rectangle implements Shape {
    private String name;
    private double width, length;
    public Rectangle(String s, double w, double l) {
        name = s; width = w; length = l;
    }
    @Override
    public double getArea() { return width * length; }
    @Override
    public String getName() { return name; }
}

class Triangle implements Shape {
    private String name;
    private double width, height;
    public Triangle(String s, double w, double h) { 
        name = s; width = w; height = h; 
    }
    @Override
    public double getArea() { return width * height / 2; }
    @Override
    public String getName() { return name; }
}

public class C14 {
    // XXX 잘못품
    // interface가 아닌 abstract class로 구현해야됨
    public static void main(String[] args) {
        Shape[] arr = { new Circle2("Circle", 5),
                        new Rectangle("Rectangle", 3, 4),
                        new Triangle("Triangle", 5, 5)
        };

        double sum = 0;
        for (Shape a : arr) {
            System.out.println(a.getName() + "면적 : " + a.getArea());
            sum += a.getArea();
        }
        System.out.println("면적의 합 : " + sum);
    }
}
