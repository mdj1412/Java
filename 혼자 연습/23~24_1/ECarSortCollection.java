import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class Car implements Comparable<Car> {
    protected int disp;

    public Car(int d) { disp = d; }
    @Override
    public String toString() { return "cc: " + disp; }
    @Override
    public int compareTo(Car o) { return disp - o.disp; }
}

class ECar extends Car {
    private int battery;

    public ECar(int d, int b) { super(d); battery = b; }
    @Override
    public String toString() { return "cc: " + disp + ", ba: " + battery; }
}

public class ECarSortCollection {
    public static void main(String[] args) {
        List<ECar> list = new ArrayList<>();
        list.add(new ECar(1200, 99));
        list.add(new ECar(3000, 55));
        list.add(new ECar(1800, 87));
        Collections.sort(list);

        Iterator<ECar> itr = list.iterator();
        while (itr.hasNext()) { System.out.println(itr.next().toString() + '\t'); }
    }
}
