import java.util.HashSet;

class NumTwo {
    private int num;
    public NumTwo(int n) { num = n; }

    @Override // class Object
    public String toString() {
        return String.valueOf(num);
    }

    @Override // class Object
    public int hashCode() {
        return num % 3;
    }

    @Override // class Object
    public boolean equals(Object obj) {
        if (num == ((NumTwo)obj).num) { return true; }
        else { return false; }
    }
}

public class HashSetEqualityTwo {
    public static void main(String[] args) {
        HashSet<NumTwo> set = new HashSet<>();
        set.add(new NumTwo(7799));
        set.add(new NumTwo(9955));
        set.add(new NumTwo(7799));
        System.out.println("인스턴스 수: " + set.size());

        for (NumTwo n : set) { System.out.print(n.toString() + '\t'); }
        System.out.println();
        for (NumTwo n : set) { System.out.print(n + "\t"); }
        System.out.println();

        set.add(new NumTwo(0));
        set.add(new NumTwo(3));
        set.add(new NumTwo(6));
        set.add(new NumTwo(1));
        set.add(new NumTwo(4));
        set.add(new NumTwo(7));
        set.add(new NumTwo(2));
        set.add(new NumTwo(5));
        set.add(new NumTwo(8));

        for (NumTwo n : set) { System.out.print(n.toString() + '\t'); }
        System.out.println();

        for (NumTwo n : set) { System.out.print(n + "\t"); }
        System.out.println();
        // XXX 위와 아래의 차이점
        // for (NumTwo n : set) { System.out.print(n + '\t'); }
        System.out.println();
    }
}
