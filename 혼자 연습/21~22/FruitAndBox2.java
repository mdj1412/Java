// class Apple {
//     @Override
//     public String toString() { return "I am an apple."; }
// }

class Orange {
    @Override
    public String toString() { return "I am an orange."; }
}

// class Box {
//     private Object ob;
//     public void set(Object o) { ob = 0; }
//     public Object get() { return ob; }
// }

public class FruitAndBox2 {
    public static void main(String[] args) {
        Box aBox = new Box();
        Box oBox = new Box();

        aBox.set(new Apple());
        oBox.set(new Orange());

        // XXX 책에서는 다르게 오류 발생
        Apple ap = new Apple();     // (Apple)aBox.get();
        Orange op = new Orange();   // (Orange)oBox.get();

        System.out.println(ap);
        System.out.println(op);
    }
}
