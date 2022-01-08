import java.util.*;

class Ex05{
    /* escape sequence */
    public static void main(String[] args){
        int num1=12;
        int num2=012;
        int num3=0x12;
        int sum=num1+num2+num3;
        int aver=sum/3;

        System.out.println("10진수 12\t: " + num1);
        System.out.println("8진수 12\t: " + num2);
        System.out.println("16진수 12\t: " + num3);
        System.out.println("Sum\t: " + sum);
        System.out.println("Average\t: " + aver);

        
    }
}
