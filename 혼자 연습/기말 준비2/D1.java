import java.util.StringTokenizer;

public class D1 {
    public static void main(String[] args) {
        String s1 = "동해물과 백두산이 마르고 닳도록";
        String s2 = "2020/11/03";
        String s3 = "2020년11월03일";

        show(s1, " ", 1);
        show(s2, "/", 2);
        show(s3, "년월일", 3);
    }

    public static void show(String s, String t, int i) {
        int count = 1;
        StringTokenizer st = new StringTokenizer(s, t);
        System.out.println("s" + i + " count: " + st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println((count++) + " : " + st.nextToken());
        }
        System.out.println();
    }
}
