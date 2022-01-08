import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class C1 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(); 
        list.add(new Person("Yoon", 23)); 
        list.add(new Person("Hong", 53)); 
        list.add(new Person("Kim", 37)); 
        list.add(new Person("Park", 67));
        list.add(new Person("Lee", 15));

        Collections.sort(list, (a, b) -> a.age - b.age);
        System.out.println("*** 나이순 정렬 ***");
        for (Person e : list) { System.out.println(e); }

        System.out.println();

        Collections.sort(list, (a, b) -> a.name.compareTo(b.name));
        System.out.println("*** 이름순 정렬 ***");
        for (Person e : list) { System.out.println(e); }
    }
}
