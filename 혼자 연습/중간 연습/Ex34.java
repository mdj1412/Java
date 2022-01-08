public class Ex34 {
    public static void main(String[] args) { 
        Circle1 c1 = new Circle1("Pizza", 0); 
        Circle1 c2 = new Circle1("donut", 0); 
        Circle1 c3 = new Circle1("hamburger", 0);

        c1.setRad(12); 
        c2.setRad(-2); 
        c3.setRad(7);

        c1.show();
        c2.show();
        c3.show();

        if (c1.getArea() > c2.getArea()) {
            if (c1.getArea() > c3.getArea())
                System.out.println("가장 큰 면적은 " + c1.getName());
            else
                System.out.println("가장 큰 면적은 " + c3.getName());
        }
        else {
            if (c2.getArea() > c3.getArea())
                System.out.println("가장 큰 면적은 " + c2.getName());
            else
                System.out.println("가장 큰 면적은 " + c3.getName());
        }
    }
}

class Circle1 {
    private double radius;
    private String name;

    public Circle1(String name, double radius) {
        this.name = name;
        setRad(radius);
    }
    public void setRad(double radius) {
        if (radius<0)
            this.radius = 0;
        else
            this.radius = radius;
    }
    public String getName() { return name; }
    public double getArea() { return radius * radius * 3.14; }
    public void show() { 
        System.out.println(name + "넓이 : " + getArea());
    }
}