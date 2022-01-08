public class BoxSwapDemo {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.set(99);

        Box<Integer> box2 = new Box<>();
        box2.set(55);

        System.out.println(box1.get() + " & " + box2.get());
        swapBox(box1, box2);
        System.out.println(box1.get() + " & " + box2.get());
    }

    public static <T extends Number> void swapBox(Box<T> b1, Box<T> b2) {
        T num = b1.get();
        b1.set(b2.get());
        b2.set(num);
    }
}
