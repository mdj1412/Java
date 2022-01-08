import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    public PerformOperation isOdd() {
        return a -> a%2 != 0;
    }
    public PerformOperation isPrime() {
        return a -> {
            boolean[] arr = new boolean[a];
            for (int i=1;i<a;i++) { 
                if (arr[i]) { continue; }
                else {
                    int idx = 2;
                    while ((i+1)*idx-1 < a) {
                        arr[(i+1)*idx-1] = true;
                        if (i*idx == a-1) { return true; }
                        idx++;
                    }
                }
            }
            return !arr[a-1];
        };
    }
    public PerformOperation isPalindrome() {
        return a -> {
            int b = a, a2 = 0;
            while (b != 0) {
                a2 = 10 * a2 + b%10;
                b /= 10;
            }
            return a == a2;
        };
    }
}
 

   // Write your code here
   
   

public class JavaLambdaExpression {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
