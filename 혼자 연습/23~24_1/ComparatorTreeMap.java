import java.util.TreeMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;


class AgeComparator2 implements Comparator<Integer> {
    @Override
    public int compare(Integer n1, Integer n2) {
        return n2 - n1;
    }
}

public class ComparatorTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(new AgeComparator2());
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        Set<Integer> ks = map.keySet();

        for (Integer n : ks) { System.out.print(n.toString() + '\t'); }
        System.out.println();

        for (Integer n : ks) { System.out.print(map.get(n).toString() + '\t'); }
        System.out.println();

        Iterator<Integer> itr = ks.iterator();
        while (itr.hasNext()) { System.out.print(map.get(itr.next()) + '\t'); }
    }
}
