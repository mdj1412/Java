import java.util.function.BiConsumer;

class Box<T> {
    private T ob;
    public void set(T o) { ob = o; }
    public T get() { return ob; }
}

public class BiConsumerDemo {
    public static void main(String[] args) {
        Box<Integer> ibox = new Box<>();
        Box<Double> dbox = new Box<>();

        BiConsumer<Box<Integer>, Integer> ic = (b, x) -> b.set(x);
        BiConsumer<Box<Double>, Double> dc = (b, x) -> b.set(x);

        ic.accept(ibox, 10);
        dc.accept(dbox, 5.49);

        System.out.println(ibox.get());
        System.out.println(dbox.get());
    }
}
