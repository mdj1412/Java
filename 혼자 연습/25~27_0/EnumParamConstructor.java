enum Person4 {
    MAN(29), WOMAN(25);
    // XXX public static final Person3 MAN = new Person3(29);
    // XXX public static final Person3 WOMAN = new Person3(25);

    int age;    // public int
    private Person4(int age) {
        this.age = age;
        // System.out.println(MAN);
    }

    @Override
    public String toString() {
        return "I am " + age + " years old";
    }
}

public class EnumParamConstructor {
    public static void main(String[] args) {
        System.out.println(Person4.MAN);
        System.out.println(Person4.WOMAN);

        // System.out.println(Person4.age);    // XXX age는 static이 아니기 때문에 오류

        Person4.MAN.age = 100;
        System.out.println(Person4.MAN.age);
        System.out.println(Person4.WOMAN.age);
        System.out.println(Person4.MAN.toString());
    }
}
