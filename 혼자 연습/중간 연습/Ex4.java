import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수입력 : ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        int sum = 0;
        for (int i=2;i<num;i++) {
            for (int j=2;j<=i;j++) {
                if (i*j >= num) { break; }
                arr[i*j]++;
            }
        }

        for (int i=2;i<num;i++) {
            if (arr[i] == 0) { 
                sum+=i; 
                if (sum >= num) { 
                    sum-=i; 
                    System.out.println("\nSum = " + sum);
                    return;
                }
                System.out.print(i + " ");
            }
        }
    }
}
