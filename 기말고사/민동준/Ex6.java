import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Ex6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("David", "Thomas", "Bill", "Eric", "Ford"));

        System.out.println(list);

        Predicate<String> filter = s -> {
            String c = s.substring(0, 1);
            return c.equals("D");
        };
        list.removeIf(filter);
        System.out.println(list);

        UnaryOperator<String> u = s -> s.toUpperCase();
        replaceAlpha(u, list);
        System.out.println(list);

        
    }

    static void replaceAlpha(UnaryOperator<String> u, List<String> list) {
        for (int i=0;i<list.size();i++) {
            list.set(i, u.apply(list.get(i)));
        }
    }
}
