import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


class Person {
    String name;
    int age;
    public Person(String name, int age) { 
        this.name = name; this.age = age;
    }
    @Override
    public String toString() { return name + " : " + age; }
}

public class Ex2 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(); 
        list.add(new Person("Yoon", 23)); 
        list.add(new Person("Hong", 53)); 
        list.add(new Person("Kim", 37)); 
        list.add(new Person("Park", 67)); 
        list.add(new Person("Lee", 15));

        Collections.sort(list, (p1, p2) -> p1.age - p2.age);
        System.out.println("*** 나이순 정렬 ***");
        showAll(list);

        Collections.sort(list, (p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println("*** 이름순 정렬 ***");
        showAll(list);
    }
    
    public static void showAll(List<Person> list) {
        for (Person p : list) { 
            System.out.println(p); 
        }
        System.out.println();
    }
}