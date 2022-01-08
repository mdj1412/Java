import java.util.Objects;

class Person23 {
    private String name;
    private int age;
    public Person23(String name, int age) { this.name = name; this.age = age; }

    @Override
    public String toString() { return name + "(" + age + "세)"; }
    @Override
    public int hashCode() {
        // return (name.hashCode() + (new Integer(age)).hashCode()) / 2;
        return Objects.hash(name, age);
    }
    @Override
    public boolean equals(Object obj) {
        Person23 comp = (Person23)obj;
        if ((name.equals(comp.name) && (age == comp.age))) { return true; }
        else { return false; }
    }
}

public class hashCodeAndEquals {
    public static void main(String[] args) {

    }
}
