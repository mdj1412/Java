public class ExA {
    public static void main(String[] args) {
        B a = new B();
        System.out.println(a.size);
        a.func();
        System.out.println(a);

        System.out.println();

        A b = new B();
        b.example();
    }
}

class A {
    public int size = 10;

    public int func() {
        System.out.println("A");
        return size;
    }
    public void example() {
        System.out.println("class A function");
    }
}

class B extends A {
    static public int apple = 20;
    public int size = 20;

    // @Override
    public void func(int n) {
        System.out.println("B");
        System.out.println(super.size);
    }
    public String toString() {
        example();                                      // XXX overriding으로 인해 하위 클래스 함수 실행
        super.example();                                // XXX 같은 이름의 함수 중에 상위 클래스의 함수를 실행시키고 싶을 때
        return "mindongjun";
    }

    public void example() {
        System.out.println("class B function");
    }
}