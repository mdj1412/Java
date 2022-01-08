import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
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
        System.out.println();
    }
}
