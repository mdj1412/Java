import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 개의 정수 입력 : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int result = 1;
        for (int i=0;i<n2;i++)
            result*=n1;
        System.out.println(n1 + "의 " + n2 + "승 = " + result);
    }
}

