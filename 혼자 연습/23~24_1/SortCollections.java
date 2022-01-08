import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class SortCollections {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Weapon");
        list = new ArrayList<>(list);

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) { System.out.print(itr.next() + '\t'); }
        System.out.println();

        Collections.sort(list);
        itr = list.iterator();
        while (itr.hasNext()) { System.out.print(itr.next() + '\t'); }
        System.out.println();
    }
}
