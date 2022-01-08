import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        Circle[] c = { new Circle("Cup", 3), 
                    new Circle("Apple", 4), 
                    new Circle("Doughnut", 5), 
                    new Circle("Pizza", 7),
                    new Circle("Ball", 2) 
                };
        
        Arrays.sort(c);
        for (Circle e : c) { e.show(); }

        int idx = Arrays.binarySearch(c, new Circle("Apple", 4));        // Apple = 4
        System.out.println("Index of " + c[idx].getName() + " : " + idx);
    }
}

class Circle implements Comparable {
    private String s;
    private double r;

    public Circle(String s, double r) { this.s = s; this.r = r; }
    public String getName() { return s; }
    public double getRadian() { return r; }
    public double getArea() { return r * r * 3.14; }
    public void show() { System.out.println(toString()); }

    @Override
    public String toString() { return s + " " + getArea(); }

    @Override
    public int compareTo(Object o) {
        Circle c = (Circle)o;
        if (this.r > c.r) { return 1; }
        else if (this.r < c.r) { return -1; }
        else { return 0; }
    }
}