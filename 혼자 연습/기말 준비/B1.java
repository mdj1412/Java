import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class B1 {
    public static void main(String[] args) {
        List<Person2> list = new ArrayList<>(); 
        list.add(new Person2("Yoon", 23)); 
        list.add(new Person2("Hong", 53)); 
        list.add(new Person2("Kim", 37)); 
        list.add(new Person2("Park", 67)); 
        list.add(new Person2("Lee", 15));

        Collections.sort(list, (p1, p2) -> p1.age - p2.age);
        System.out.println("*** 나이순 정렬 ***");
        show(list);

        System.out.println();

        Collections.sort(list, (p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println("*** 이름순 정렬 ***");
        show(list);
    }

    public static void show(List<Person2> list) {
        for (Person2 e : list) {
            System.out.println(e);
        }
    }
}

class Person2 {
    String name;
    int age;
    public Person2(String name, int age) { 
        this.name = name; this.age = age;
    }
    @Override
    public String toString() { return name + " : " + age; }
    // @Override
    // public int compareTo(Person p) {
    //     return age - p.age;
    // }
}