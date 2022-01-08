import java.util.Scanner;

public class Ex4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수입력 : ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        int sum = 0;
        int idx = 2;
        while (true) {
            if (arr[idx] != 0) { idx++; continue; }
            sum += idx;
            if (sum >= num) { sum -= idx; arr[idx]--; break; }
            for (int i=2;i<=num;i++) {
                if (idx*i >= num) { break; }
                arr[idx*i]++;
            }
            idx++;
        }

        for (int i=2;i<num;i++) {
            if (arr[i]<0) { break; }
            if (arr[i] == 0) { System.out.print(i + " "); }
        }
        System.out.println("\nSum = " + sum);
    }
}
