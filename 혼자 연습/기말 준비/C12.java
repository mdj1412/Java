import java.util.Arrays;
import java.util.Comparator;


public class C12 {
    public static void main(String[] args) {
        Circle[] c = { new Circle("Cup", 3), 
                        new Circle("Apple", 4), 
                        new Circle("Doughnut", 5), 
                        new Circle("Pizza", 7),
                        new Circle("Ball", 2) 
        };

        Arrays.sort(c);
        for (Circle e : c) { System.out.println(e); }

        Comparator<Circle> compara = (a, b) -> a.getName().compareTo(b.getName());

        int idx = Arrays.binarySearch(c, new Circle("Apple", 0), compara);
        System.out.println("Index of Apple : " + idx);
    }
}

class Circle implements Comparable<Circle> { 
    private String name;
    private int radius;

    public Circle(String s, int r) {
        name = s; radius = r;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name + " " + (radius * radius * 3.14);
    }

    @Override
    public int compareTo(Circle c) {
        if (this.radius > c.radius) { return 1; }
        else if (this.radius < c.radius) { return -1; }
        else { return 0; }
    }
}