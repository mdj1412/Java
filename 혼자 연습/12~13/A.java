import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);

        int j = i.nextInt();
        System.out.println("int : " + j);
        System.out.println("int : " + i.nextInt());          // '1234'\n
        System.out.println("string 1 : " + i.nextLine());      // '\n'adsfads
        System.out.println("string 2 : " + i.nextLine());


        // System.out.println("string : " + i.nextLine());         // '12341231'\n
        // System.out.println("int : " + i.nextInt());             // \n'23532'


        
        System.out.println("int : " + i.nextInt());
        System.out.println("int : " + i.nextInt());
        i.close();
    }
}
