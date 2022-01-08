class Robot {
    @Override
    public String toString() { return "I am a Robot"; }
}

class BoxHandler3 {
    public static <T> void outBox(Box<? extends T> box) {
        T t = box.get();
        System.out.println(t);
    }
    public static <T> void inBox(Box<? super T> box, T n) {
        box.set(n);
    }
}

public class BoundedWildcardGenericMethod {
    public static void main(String[] args) {
        Box<Toy> tBox = new Box<>();
        BoxHandler3.inBox(tBox, new Toy());
        BoxHandler3.outBox(tBox);

        Box<Robot> rBox = new Box<>();
        BoxHandler3.inBox(rBox, new Robot());
        BoxHandler3.outBox(rBox);

    }
}
