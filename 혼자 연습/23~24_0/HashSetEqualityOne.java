import java.util.HashSet;

class Num {
    private int num;
    public Num(int n) { num = n; }

    @Override   // class Object
    public String toString() {
        return String.valueOf(num);
    }
}

public class HashSetEqualityOne {
    public static void main(String[] args) {
        HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));
        System.out.println("인스턴스 수 : " + set.size());

        for (Num n : set) { System.out.print(n.toString() + '\t'); }
        System.out.println();
        // XXX 위와 아래의 차이점
        for (Num n : set) { System.out.print(n + "\t"); }
        System.out.println();

        // for (Num n : set) { System.out.print(n + '\t'); }
        System.out.println();
    }
}
