import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.ListIterator;


public class ListIteratorCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        list = new ArrayList<>(list);

        ListIterator<String> litr = list.listIterator();

        String str;
        while (litr.hasNext()) {
            str = litr.next();
            System.out.print(str + '\t');
            if (str.equals("Toy")) { litr.add("Toy2"); }
        }
        System.out.println();

        while (litr.hasPrevious()) {
            str = litr.previous();
            System.out.print(str + '\t');
            if (str.equals("Robot")) { litr.add("Robot2"); }
        }
        System.out.println();

        for (Iterator<String> itr = list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();
    }
}
