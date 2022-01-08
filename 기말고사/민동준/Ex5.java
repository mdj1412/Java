import java.util.ArrayList;
import java.util.Collections;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>(); 
        list.add(new Student("이순신", 100, 100, 100)); 
        list.add(new Student("홍길동", 90, 70, 80)); 
        list.add(new Student("김철수", 80, 80, 90)); 
        list.add(new Student("이영희", 70, 90, 70)); 
        list.add(new Student("안자바", 60, 100, 80)); 
        Collections.sort(list);

        System.out.println("- 정렬 1");
        for(Student s : list)
            System.out.println(s);

        System.out.println("- 정렬 2");
        Collections.sort(list, (a,b) -> a.getName().compareTo(b.getName()));
        for(Student s : list) 
            System.out.println(s);
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int n1, n2, n3;

    public Student(String name, int n1, int n2, int n3) {
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public String toString() {
        int sum = n1 + n2 + n3;
        return name + " : " + sum + " (" + n1 + "," + n2 + "," + n3 + ")";
    }
    public int compareTo(Student s) {
        int sum1 = n1 + n2 + n3;
        int sum2 = s.n1 + s.n2 + s.n3;
        if (sum1 == sum2) { return s.name.compareTo(name); }
        return sum1 - sum2;
    }
    public String getName() { return name; }
}