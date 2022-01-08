import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        int num;

        for (int i=0;i<100;i++) {
            num = rand.nextInt(10);
            System.out.print(num);
            arr[num]++;
            if (i % 20 == 19) { System.out.println(); }
        }
        
        System.out.println();
        for (int i=0;i<10;i++) {
            System.out.print(i + "개수: ");
            for (int j=0;j<arr[i];j++) { System.out.print("*"); }
            System.out.println();
        }
    }
}
