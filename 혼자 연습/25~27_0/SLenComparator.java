import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

interface Ex {
    public void p1(String s1, String s2);
    public void p2(String s1, String s2);
}

public class SLenComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Robot");
        list.add("Lambda");
        list.add("Box");

        Collections.sort(list, (s1,s2)->s1.length()-s2.length());

        for (String s : list) {
            System.out.println(s);
        }
    }   
}
