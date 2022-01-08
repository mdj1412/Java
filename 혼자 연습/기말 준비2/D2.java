import java.util.Random;

public class D2 {
    public static void main(String[] args) {
        int midpoint;
        Random rand = new Random();
        int[] count = new int[10];
        for (int i=0;i<100;i++) {
            midpoint = rand.nextInt(10);
            System.out.print(midpoint);
            count[midpoint]++;
            if (i%20 == 19) { System.out.println(); }
        }

        System.out.println();
        for (int i=0;i<10;i++) {
            System.out.print(i + "개수:");
            for (int j=0;j<count[i];j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}