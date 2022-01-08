import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex4 {
    public static void main(String[] args) {
        String[] data = { "A", "K", "A", "K", "D", "A",
                              "K", "K", "K", "Z", "D" };
        HashMap<String, Integer> map = new HashMap<>();

        // for (String e : data) {
        //     if (map.containsKey(e)) {
        //         map.replace(e, map.get(e) + 1);
        //     }
        //     else {
        //         map.put(e, new Integer(1));
        //     }
        // }

        // TreeSet<String> set = new TreeSet<>(map.keySet());
        // Iterator<String> itr = set.iterator();
        // String key;
        // while (itr.hasNext()) {
        //     key = itr.next();
        //     System.out.println(key + " : " + map.get(key));
        // }


        Integer value = 0;

        for (int i=0;i<data.length;i++) {
            if (map.containsKey(data[i])) {
                value = map.get(data[i]);
                map.put(data[i], value + 1);
            }
            else { map.put(data[i], new Integer(1)); }
        }

        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        Iterator<String> itr = keyList.iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println(key + " : " + map.get(key));
        }
    }
}
