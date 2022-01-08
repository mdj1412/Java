class Person {
    public static final Person MAN = new Person();
    public static final Person WOMAN = new Person();

    @Override
    public String toString() {
        return "I am a dog person";
    }
}

enum Animal {
    CAT, DOG
}

public class InClassInst {
    public static void main(String[] args) {
        System.out.println(Person.MAN);
        System.out.println(Person.WOMAN);

        System.out.println(Person.MAN.MAN.WOMAN);

        System.out.println(Animal.CAT);
        System.out.println(Animal.CAT.CAT.CAT);
    }
}
