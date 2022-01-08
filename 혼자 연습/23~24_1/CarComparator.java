import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


class CarComp implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) { return c2.disp - c1.disp; }
}

public class CarComparator {
    public static void main(String[] args) {
        List<Car> clist = new ArrayList<>();
        clist.add(new Car(1800));
        clist.add(new Car(1200));
        clist.add(new Car(3000));

        List<ECar> elist = new ArrayList<>();
        elist.add(new ECar(3000, 55));
        elist.add(new ECar(1800, 87));
        elist.add(new ECar(1200, 99));

        CarComp comp = new CarComp();

        Collections.sort(clist, comp);  // XXX 내림차순
        Collections.sort(elist);        // XXX 오름차순

        Iterator<Car> citr = clist.iterator();
        while (citr.hasNext()) { System.out.println(citr.next()); }
        System.out.println();

        Iterator<ECar> eitr = elist.iterator();
        while (eitr.hasNext()) { System.out.println(eitr.next()); }
        System.out.println();
    }
}
