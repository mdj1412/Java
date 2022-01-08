import java.util.Arrays;

public class D3 {
    public static void main(String[] args) {
        Circle[] c = { new Circle("Cup", 3), new Circle("Apple", 4),
                    new Circle("Doughnut", 5), new Circle("Pizza", 7),
                    new Circle("Ball", 2) 
        };

        Arrays.sort(c);
        for (Circle e : c) {
            System.out.println(e);
        }

        int idx;
        idx = Arrays.binarySearch(c, new Circle("Apple", 4));
        System.out.println("Index of " + c[idx].getName() + " : " + idx);
    }
}

class Circle implements Comparable {
    private String name;
    private double radius;
    
    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }
    @Override
    public String toString() {
        return name + " " + (radius * radius * 3.14);
    }
    @Override
    public int compareTo(Object o) {
        Circle c = (Circle)o;
        if ((this.radius - c.radius > 0)) { return 1; }
        else if ((this.radius - c.radius < 0)) { return -1; }
        else { return 0; }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}