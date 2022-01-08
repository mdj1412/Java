class Unboxer {
    public static <T extends Number> T openBox(Box<T> box) {
        System.out.println("Unboxed data: " + box.get().intValue());
        return box.get();
    }
    public static void peekBox(Box<? extends Number> box) {
        System.out.println(box);
    }
    public static void peekBox2(Box<? super Integer> box) {
        System.out.println(box);
    }
}

public class LowerBoundedWildcard {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>();
        iBox.set(5577);

        Box<Number> nBox = new Box<>();
        nBox.set(9955);

        Box<Object> oBox = new Box<Object>();
        oBox.set("My simple Instance");

        Unboxer.peekBox2(iBox);
        Unboxer.peekBox2(nBox);
        Unboxer.peekBox2(oBox);
    }
}
