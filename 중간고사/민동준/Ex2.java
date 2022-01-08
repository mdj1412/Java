public class Ex2 {
    public static void main(String[] args) {
        int[] A = { 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3 }; 
        int[] B = { 3, 2, 1, -1 };
        int[] C = { 5, 3, 2, 1, -3 };
        int[] R = ArrayUtil.calc(A, B, C); 
        System.out.print("A - (B U C) = { " + R[0]); 
        for (int i = 1; i < R.length; i++)
            System.out.print(", " + R[i]); 
        System.out.println(" }");
    }
}

class ArrayUtil {
    public static int[] calc(int[] a, int[] b, int[] c) {
        int[] count = new int[a.length];

        for (int i=0;i<a.length;i++) {
            for (int e : b) {
                if (a[i] == e) { count[i] = 1; }
            }
        }
        for (int i=0;i<a.length;i++) {
            for (int e : c) {
                if (a[i] == e) { count[i] = 1; }
            }
        }

        int length = 0;
        for (int e : count) { if (e == 0) { length++; } }
        int[] answer = new int[length];
        int idx = 0;
        for (int i=0;i<count.length;i++) {
            if (count[i] == 0) {
                answer[idx] = a[i];
                idx++;
            }
        }
        return answer;
    }
}