import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B1 {
    public static void main(String[] args) {
        List<Person2> list = new ArrayList<>(); 
        list.add(new Person2("Yoon", 23)); 
        list.add(new Person2("Hong", 53)); 
        list.add(new Person2("Kim", 37)); 
        list.add(new Person2("Park", 67)); 
        list.add(new Person2("Lee", 15));

        System.out.println("*** 나이순 정렬 ***");
        Collections.sort(list);
        for (Person2 e : list) {
            System.out.println(e);
        }

        System.out.println();

        System.out.println("*** 이름순 정렬 ***");
        Collections.sort(list, (a, b) -> a.name.compareTo(b.name));
        for (Person2 e : list) {
            System.out.println(e);
        }
    }
}

class Person2 implements Comparable<Person2> {
    String name;
    int age;
    public Person2(String name, int age) { 
        this.name = name; this.age = age;
    }   
    public String toString() { return name + " : " + age; } 
    @Override
    public int compareTo(Person2 o) {
        return this.age - o.age;
    }
}