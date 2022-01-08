import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A2 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(); 
        list.add(new Person("Yoon", 23)); 
        list.add(new Person("Hong", 53)); 
        list.add(new Person("Kim", 37)); 
        list.add(new Person("Park", 67)); 
        list.add(new Person("Lee", 15));

        System.out.println("*** 나이순 정렬 ***");
        Collections.sort(list, (a, b) -> a.age - b.age);
        for (Person e : list) {
            System.out.println(e);
        }

        System.out.println();

        System.out.println("*** 이름순 정렬 ***");
        Collections.sort(list, (a, b) -> a.name.compareTo(b.name));
        for (Person e : list) {
            System.out.println(e);
        }
    }
}

class Person {
    String name;
    int age;
    public Person(String name, int age) { 
        this.name = name; this.age = age;
    }   
    public String toString() { return name + " : " + age; } 
}