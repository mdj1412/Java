public class A {
    public static void main(String[] args) {
        String a = "apple";
        String b;
        b = a;
        
        System.out.println(a);
        System.out.println(b);      // XXX 값 변경이 불가능하므로 clone 함수가 필요 없다.
    }
}