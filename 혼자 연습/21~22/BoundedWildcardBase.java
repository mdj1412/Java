class Toy {
    @Override
    public String toString() { return "I am a Toy"; }
}

class BoxHandler {
    // public static <T extends Toy> void outBox(Box<T> box) {
    //     Toy t = box.get();
    //     box.set(new Toy());
    //     System.out.println(t);
    // }
    public static void outBox(Box<? extends Toy> box) {
        Toy t = box.get();
        // box.set(new Toy());
        System.out.println(t);
    }
    public static void inBox(Box<Toy> box, Toy n) {
        box.set(n);
    }
}

public class BoundedWildcardBase {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);
    }
}
