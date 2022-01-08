import java.util.Scanner;       // XXX 설정
// XXX import할 때 클래스까지 불러오기

public class ScannerClass {
    public static void main(String[] args){
        String source = "1 3 5";
        Scanner sc = new Scanner(source);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);
    }
}

// XXX 무조건 출력할 때 nextLine() nextInt() nextByte() nextDouble() nextBoolean()