public class Ex2 {
    public static void main(String[] args) {
        int[] a = { 5, 4, 3, 2, 1 };
        int[] b = { 3, 2, 1, 0, -1 };
        int[] p = sum(a, b); 
        System.out.print("A U B = { " + p[0]); 
        for (int i = 1; i < p.length; i++)
            System.out.print(", " + p[i]); 
        System.out.print(" }");
    }

    public static int[] sum(int[] a, int[] b) {
        int count = a.length + b.length;
        int[] compareArray = new int[b.length];
        for (int e1 : a) {
            for (int i=0;i<b.length;i++) { if (e1 == b[i]) { count--; compareArray[i]++; } }
        }

        System.out.println(count);
        int[] answer = new int[count];
        System.arraycopy(a, 0, answer, 0, a.length);

        int k = a.length;
        for (int j=0;j<b.length;j++) {
            if (compareArray[j] == 0) { answer[k++] = b[j]; } 
        }
        return answer;
    }
}
