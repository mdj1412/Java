public class Ex3 {
    public static void main(String[] args) {
        Shape [] list = { new Circle(20),
            new Oval(20, 30), new Rect(20, 30)
        }; 
        for (Shape a : list)
            a.draw();
        for (Shape a : list)
            System.out.println("면적은 " + a.getArea()); 
    }
}



interface Shape {
    final double PI = 3.14; 
    void draw();
    double getArea();
}

class Circle implements Shape {
    private int length;
    public Circle(int length) {
        this.length = length;
    }
    @Override
    public void draw() {
        System.out.println("반지름이 " + length + "인 원입니다.");
    }
    @Override
    public double getArea() {
        return PI * length * length;
    } 
}

class Oval implements Shape {
    private int width, height;
    public Oval(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println(width + "X" + height + "에 내접하는 타원입니다.");
    }
    @Override
    public double getArea() {
        return PI * width * height;
    } 
}

class Rect implements Shape {
    private int width, height;
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println(width + "X" + height + "크기의 사각형입니다.");
    }
    @Override
    public double getArea() {
        return width * height;
    } 
}