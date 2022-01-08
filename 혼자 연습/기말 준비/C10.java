import java.util.StringTokenizer;

public class C10 {
    public static void main(String[] args) {
        String s1 = "동해물과 백두산이 마르고 닳도록";
        String s2 = "2020/11/03";
        String s3 = "2020년11월03일";

        printing(s1, " ", 1);
        printing(s2, "/", 2);
        printing(s3, "년월일", 3);
        
    }

    public static void printing(String s, String k, int idx) {
        StringTokenizer st = new StringTokenizer(s, k);
        int i = 1;

        System.out.println("s" + idx + " count: " + st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println((i++) + " : " + st.nextToken());
        }
        System.out.println();
    }

}
