import java.util.Random;


public class C11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[5][20];
        int[] count = new int[10];
        int midpoint;
        int sum = 0; // 확인차 결과물

        for (int i=0;i<5;i++) {
            for (int j=0;j<20;j++) {
                midpoint = rand.nextInt(10);
                arr[i][j] = midpoint;
                System.out.print(midpoint);
                count[midpoint]++;
            }
            System.out.println();
        }

        for (int i=0;i<10;i++) {
            System.out.print(i + "개수: ");
            sum += count[i];
            for (int j=0;j<count[i];j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n : " + sum);
    }
}
