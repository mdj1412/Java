class Customer {
    enum Gender {
        MALE, FEMALE
        // public static final Gender MALE = new Gender();
    }

    private String name;
    private Gender gen;

    Customer(String n, String g) {
        name = n;

        if (g.equals("man")) { gen = Gender.MALE; }
        else { gen = Gender.FEMALE; }
    }

    @Override
    public String toString() {
        if (gen == Gender.MALE) { return "Thank you, Mr " + name; }
        else { return "Thank you, Mrs " + name; }
    }
}

public class InnerEnum {
    public static void main(String[] args) {
        Customer cus1 = new Customer("Brown", "man");
        Customer cus2 = new Customer("Susan Hill", "woman");

        System.out.println(cus1);
        System.out.println(cus2);

        // XXX class 내부에서 enum을 정의한 경우 다른 클래스에서 사용 못함
        // System.out.println(cus1.Gender.MALE);
    }
}
