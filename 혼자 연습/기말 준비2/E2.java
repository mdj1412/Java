public class E2 {
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


abstract class Shape {
    private String name;

    public Shape(String name) { this.name = name; }
    public String getName() { return name; }
    public abstract double getArea();
}

class Circle2 extends Shape {
    private double radius;

    public Circle2(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double width, height;

    public Triangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height / 2;
    }
}