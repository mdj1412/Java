import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;


public class ConvertCollection {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
        ArrayList<String> list = new ArrayList<>(lst);

        for (String s : list) { System.out.print(s.toString() + '\t'); }
        System.out.println();

        HashSet<String> set = new HashSet<>(list);      // XXX 중복된 인스턴스 제거

        list = new ArrayList<>(set);                    // 원래대로

        for (String s : list) { System.out.print(s.toString() + '\t'); }
        System.out.println();
    }
}
