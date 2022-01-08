public class Ex3 {
    public static void main(String[] args) {
        Shape[] arr = { new Circle("Circle", 5),
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

class Shape {
    private String name;

    public Shape(String name) { this.name = name; }
    public String getName() { return name; }
    public double getArea() { return 0; }
}

class Circle extends Shape {
    private int radius;
    private final double PI = 3.14;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public double getArea() { return radius * radius * PI; }
}

class Rectangle extends Shape {
    private int width, height;
    
    public Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() { return width * height; }
}

class Triangle extends Shape {
    private int width, height;

    public Triangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() { return width * height / 2.0; }
}