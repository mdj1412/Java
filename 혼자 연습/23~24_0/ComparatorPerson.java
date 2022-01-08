import java.util.TreeSet;
import java.util.Comparator;

class CPerson implements Comparable<CPerson> {
    private String name;
    private int age;

    public int getAge() { return age; }
    public CPerson(String name, int age) { this.name = name; this.age = age; }
    @Override
    public String toString() { return name + " : " + age; }
    @Override
    public int compareTo(CPerson p) { return this.age - p.age; }
}

class PersonComparator implements Comparator<CPerson> {
    @Override
    public int compare(CPerson p1, CPerson p2) { return p2.getAge() - p1.getAge(); }
}

public class ComparatorPerson {
    public static void main(String[] args) {
        TreeSet<CPerson> tree = new TreeSet<>(new PersonComparator());
        tree.add(new CPerson("YOON", 37));
        tree.add(new CPerson("HONG", 53));
        tree.add(new CPerson("PARK", 22));

        for (CPerson p : tree) { System.out.println(p); }
    }
}
