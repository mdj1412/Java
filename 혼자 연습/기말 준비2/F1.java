public class F1 {
    public static void main(String[] args) {
        Shape5[] arr = { new Circle3("Circle", 5),
                        new Rectangle3("Rectangle", 3, 4),
                        new Triangle3("Triangle", 5, 5)
        };
        double sum = 0;
        for (Shape5 a : arr) {
            System.out.println(a.getName() + "면적 : " + a.getArea());
            sum += a.getArea();
        }
        System.out.println("면적의 합 : " + sum);
    }
}

abstract class Shape5 {
    private String name;
    public Shape5(String name) { this.name = name; }
    public String getName() { return name; }
    public abstract double getArea();
}

class Circle3 extends Shape5 {
    private int radius;
    public Circle3(String name, int radius) {
        super(name);
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle3 extends Shape5 {
    private int width, height;
    public Rectangle3(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
}

class Triangle3 extends Shape5 {
    private int width, height;
    public Triangle3(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return 0.5 * width * height;
    }
}