import java.util.TreeSet;
import java.util.Comparator;

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) { return s1.length() - s2.length(); }
}

public class ComparatorString {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>(new StringComparator());
        tree.add("Box");
        tree.add("Rabbit");
        tree.add("Robot");

        for (String s : tree) { System.out.print(s.toString() + '\t'); }
        System.out.println();

        for (String s : tree) { System.out.print(s + '\t'); }
        System.out.println();

        // XXX 위와 아래의 차이점
        
        for (String s : tree) { System.out.print(s + "\t"); }
        System.out.println();
    }
}
