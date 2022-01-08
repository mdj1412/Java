import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int count, sum;

        count = sc.nextInt();
        int[] arr = new int[count];
        for (int i=0;i<count;i++) {
            arr[i] = sc.nextInt();
            for (int j=0;j<arr[i];j++) {
                list.add(sc.nextInt());
            }
        }

        int row, column;
        count = sc.nextInt();
        for (int i=0;i<count;i++) {
            row = sc.nextInt();
            column = sc.nextInt();

            if (arr[row-1] < column) { System.out.println("ERROR!"); }
            else {
                sum = column-1;
                for (int j=0;j<row-1;j++) { sum += arr[j]; }
                System.out.println(list.get(sum));
            }
        }
    }
}

// 5
// 5 41 77 74 22 44
// 1 12
// 4 37 34 36 52
// 0
// 3 20 22 33
// 5
// 1 3
// 3 4
// 3 1
// 4 3
// 5 5