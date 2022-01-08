import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class StrComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) { return s1.compareToIgnoreCase(s2); }
}

public class StringComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ROBOT");
        list.add("APPLE");
        list.add("BOX");

        StrComparator cmp = new StrComparator();
        Collections.sort(list, cmp);
        int idx = Collections.binarySearch(list, "Robot", cmp);
        System.out.println(list.get(idx));
    }
}
