enum Person3 {
    MAN, WOMAN;
    // public static final Person3 MAN = new Person3();
    // public static final Person3 WOMAN = new Person3();

    private Person3() {
        System.out.println("Person constructor called");
        // System.out.println(MAN);
    }

    @Override
    public String toString() {
        return "I am a dog person";
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
        System.out.println(Person3.MAN);
        System.out.println(Person3.WOMAN);
    }
}
