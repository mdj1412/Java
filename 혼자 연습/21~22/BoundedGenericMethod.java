class BoxFactory2 {
    public static <T extends Number> Box<T> makeBox(T o) {
        Box<T> box = new Box<>();
        box.set(o);

        System.out.println("Boxed data: " + o.intValue());
        return box;
    }
}

// class Unboxer {
//     public static <T extends Number> T openBox(Box<T> box) {
//         System.out.println("Unboxed data: " + box.get().intValue());
//         return box.get();
//     }
// }

public class BoundedGenericMethod {
    public static void main(String[] args) {
        Box<Integer> sBox = BoxFactory2.makeBox(new Integer(5959));
        int n = Unboxer.openBox(sBox);
        System.out.println("Retruned data: " + n);
    }
}
