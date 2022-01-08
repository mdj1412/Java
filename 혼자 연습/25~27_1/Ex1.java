enum Company {
    AMAZON(170), APPLE(165), GOOGLE(136), FACEBOOK(101), MICROSOFT(91);

    private int value;
    private Company(int n) { value = n; }
    @Override
    public  String toString() {
        return (this.ordinal()+1) + "위 " + this.name() + " 기업가치 " + value + "조";
    }
}

public class Ex1 {
    public static void main(String[] args) {
        showAll("FACEBOOK");
        showAll("APPLE", "MICROSOFT"); 
        showAll("AMAZON", "APPLE", "GOOGLE");
    }

    public static void showAll(String... s){
        Company com;
        // for (String e : s) {
        //     com = Company.valueOf(e);
        //     System.out.println(com);
        // }

        for (int i=0;i<s.length;i++) {
            com = Company.valueOf(s[i]);
            System.out.println(com);
        }
        System.out.println("세계 기업가치 Top5 중에서 " + s.length + "개 기업이 있습니다.\n");
    }
}
