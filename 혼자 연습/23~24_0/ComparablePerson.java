import java.util.TreeSet;
// import java.util.Iterator;

// class CPerson implements Comparable<CPerson> {
//     private String name;
//     private int age;

//     public CPerson(String name, int age) { this.name = name; this.age = age; }
//     @Override
//     public String toString() { return name + " : " + age; }
//     @Override
//     public int compareTo(CPerson p) { return this.age - p.age; }
// }

public class ComparablePerson {
    public static void main(String[] args) {
        TreeSet<CPerson> tree = new TreeSet<>();
        tree.add(new CPerson("YOON", 37));
        tree.add(new CPerson("HONG", 53));
        tree.add(new CPerson("PARK", 22));
        tree.add(new CPerson("PARK", 23));
        tree.add(new CPerson("james", 22));             // XXX TreeSet의 단점

        for (CPerson p : tree) { System.out.println(p); }
    }
}
