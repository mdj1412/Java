import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class A0 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(); 
        list.add(new Person("Yoon", 23)); 
        list.add(new Person("Hong", 53)); 
        list.add(new Person("Kim", 37)); 
        list.add(new Person("Park", 67)); 
        list.add(new Person("Lee", 15));

        Collections.sort(list);
        System.out.println("*** 나이순 정렬 ***");
        show(list);

        System.out.println();

        Collections.sort(list, new PComparator());
        System.out.println("*** 이름순 정렬 ***");
        show(list);
    }

    public static void show(List<Person> list) {
        for (Person e : list) {
            System.out.println(e);
        }
    }
}

class PComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

class Person implements Comparable<Person> {
    String name;
    int age;
    public Person(String name, int age) { 
        this.name = name; this.age = age;
    }
    @Override
    public String toString() { return name + " : " + age; }
    @Override
    public int compareTo(Person p) {
        return age - p.age;
    }
}