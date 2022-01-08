public class BoundedWildcardGeneric {
    public static <T> boolean compBox(Box<? extends T> box, T con) {
        T bc = box.get();
        return bc.equals(con);
    }
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.set(24);
        Box<String> box2 = new Box<>();
        box2.set("Poly");

        if (compBox(box1, 25))
            System.out.println("상자 안에 25 저장");
    }
}
