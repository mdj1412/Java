import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class A4 {
    public static void main(String[] args) {
        String[] data = { "A", "K", "A", "K", "D", "A",
                              "K", "K", "K", "Z", "D" };
        HashMap<String, Integer> map = new HashMap<>();

        for (String e : data) {
            if (map.containsKey(e)) {
                map.replace(e, map.get(e) + 1);
            }
            else { map.put(e, 1); }
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for (String e : list) {
            System.out.println(e + " : " + map.get(e));
        }
    }
}

// TreeSet<String> set = new TreeSet<>(map.keySet());
// for (String e : set) {
//     System.out.println(e + " : " + map.get(e));
// }