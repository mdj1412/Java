import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;

public class A3 {
    public static void main(String[] args) {
        List<Integer> list;

        IntSupplier s = () -> {
            Random rand = new Random();
            return rand.nextInt(100) + 100;
        };
        list = makeRandomList(s, 10);
        System.out.println(list);

        IntUnaryOperator u = a -> a/100 + a%100/10 + a%10;
        sumDigits(u, list);
        System.out.println(list);

        Predicate<Integer> filter = a -> a>=10;
        list.removeIf(filter);
        System.out.println(list);
    }

    static <T> List<Integer> makeRandomList(IntSupplier s, int size) {
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<size;i++) {
            list.add(s.getAsInt());
        }
        return list;
    }
    
    static void sumDigits(IntUnaryOperator u, List<Integer> list) {
        for (int i=0;i<list.size();i++) {
            list.set(i, u.applyAsInt(list.get(i)));
        }
    }
}
