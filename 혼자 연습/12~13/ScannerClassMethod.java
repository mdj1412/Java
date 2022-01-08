import java.util.Scanner;

public class ScannerClassMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str1 = sc.nextLine();

        System.out.print("문자열 입력: ");
        String str2 = sc.nextLine();

        System.out.printf("입력된 문자열 1: %s \n", str1);
        System.out.printf("입력된 문자열 2: %s \n", str2);

        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        int num2 = sc1.nextInt();
        int num3 = sc1.nextInt();
        System.out.printf("%d + %d + %d =  \n", num1, num2, num3);
        
        sc.close();
    }
}