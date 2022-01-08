class BoxHandler2 {
    public static void outBox(Box<? extends Toy> box) {
        Toy t = box.get();
        System.out.println(t);
    }
    public static void inBox(Box<? super Toy> box, Toy n) {
        box.set(n);
    }
}

public class BoundedWildcardUsage2 {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        BoxHandler2.inBox(box, new Toy());
        BoxHandler2.outBox(box);
    }
}