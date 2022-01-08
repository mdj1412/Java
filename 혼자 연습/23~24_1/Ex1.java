import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ex1 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Yoon", 23)); 
        list.add(new Person("Hong", 53)); 
        list.add(new Person("Kim", 37)); 
        list.add(new Person("Park", 67)); 
        list.add(new Person("Lee", 15));

        Collections.sort(list);

        System.out.println("*** 나이순 정렬 ***");
        Iterator<Person> itr = list.iterator();
        while (itr.hasNext()) { System.out.println(itr.next()); } // itr.next().toString()
        System.out.println();

        AgeComparator com = new AgeComparator();
        Collections.sort(list, com);

        System.out.println("*** 이름순 정렬 ***");
        itr = list.iterator();
        while (itr.hasNext()) { System.out.println(itr.next()); } // itr.next().toString()
        System.out.println();
    }
}

class Person implements Comparable<Person> {
    String name;
    int age;
    public Person(String name, int age) { 
        this.name = name; 
        this.age = age; 
    }
    @Override // java.lang.Object
    public String toString() { 
        return name + " : " + age; 
    }
    @Override // java.lang.Comparable
    public int compareTo(Person p) { 
        return age - p.age; 
    }
}

class AgeComparator implements Comparator<Person> {
    @Override // java.util.Comparator
    public int compare(Person p1, Person p2) { 
        return p1.name.compareTo(p2.name); 
    }   // Integer class나 String class에서는 이미 compareTo가 구현되어 있다.
}