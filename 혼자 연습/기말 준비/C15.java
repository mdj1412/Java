import java.util.Scanner;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;

public class C15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("x값 : "); 
            int x = scan.nextInt(); 
            System.out.print("y값 : "); 
            int y = scan.nextInt();
            
            System.out.println("x * y = " + mul(x, y)); 
            System.out.println("x / y = " + div(x, y));
        }
        catch (ArithmeticException | InputMismatchException e) {
            e.printStackTrace();
        }
        finally {   // 코드의 실행이 try 안으로 진입하면, 무조건 실행된다.
            System.out.println("프로그램을 종료합니다.");
        }
    }
    public static double mul(int x, int y) { return x * y; }
    public static double div(int x, int y) { return x / y; }
}
