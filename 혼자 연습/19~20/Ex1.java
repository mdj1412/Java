import java.util.StringTokenizer;

public class Ex1 {
    public static void main(String[] args) {
        String s1 = "동해물과 백두산이 마르고 닳도록";
        String s2 = "2020/11/03";
        String s3 = "2020년11월03일";

        System.out.print("s1 count: "); printToken(s1, " ");            // StringTokenizer t = new StringTokenizer(s1);
        System.out.print("s2 count: "); printToken(s2, "/");            // StringTokenizer t = new StringTokenizer(s2, "/");
        System.out.print("s3 count: "); printToken(s3, "년월일");         // StringTokenizer t = new StringTokenizer(s3, "년월일");
    }

    public static void printToken(String s, String delimiter) {
        StringTokenizer t = new StringTokenizer(s, delimiter);
        int idx = 1;

        System.out.println(t.countTokens());
        while (t.hasMoreTokens())
            System.out.println((idx++) + " : " + t.nextToken() + ' ');
        System.out.println();
    }
}
