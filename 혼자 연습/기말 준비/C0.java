enum Country {
    AMAZON(170), APPLE(165), GOOGLE(136), FACEBOOK(101), MICROSOFT(91);

    int value;
    private Country(int n) { value = n; }
    @Override
    public String toString() {
        return (this.ordinal()+1) + "위 " + this.name() + " 기업가치 " + value + "조";
    }
}

public class C0 {
    public static void main(String[] args) {
        showAll("FACEBOOK");
        showAll("APPLE", "MICROSOFT"); 
        showAll("AMAZON", "APPLE", "GOOGLE");
    }
    public static void showAll(String... s) {
        Country c;
        for (String e : s) {
            c = Country.valueOf(e);
            System.out.println(c);
        }
        System.out.println("세계 기업가치 Top5중에서 " + s.length + "개 기업이 있습니다.\n");
    }
}
