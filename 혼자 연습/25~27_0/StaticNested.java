class Outer {
    private static int num = 0;
    private int num2 = 0;
    static class Nested1 {
        private int num3 = 0;
        private static int num4 = 0;
        void add(int n) { num += n; }
        void add3(int n) { num3 += n; }
        void add4(int n) { num4 += n; }
        int get3() { return num3; }
        int get4() { return num4; }
    }
    static class Nested2 {
        int get() { return num; }
    }

    static class Nested3 {
        void add(int n) { num += n; }
        int get() { return num; }
    }
}

public class StaticNested {
    public static void main(String[] args) {
        Outer.Nested1 nst1 = new Outer.Nested1();
        nst1.add(5);
        Outer.Nested2 nst2 = new Outer.Nested2();
        System.out.println(nst2.get());


        Outer.Nested1 a1 = new Outer.Nested1();
        Outer.Nested1 a2 = new Outer.Nested1();
        a1.add3(1);
        a1.add4(100);
        System.out.println("a1 => n3 : " + a1.get3());
        System.out.println("a1 => n4 : " + a1.get4());
        System.out.println("a2 => n3 : " + a2.get3());
        System.out.println("a2 => n4 : " + a2.get4());

    }
}