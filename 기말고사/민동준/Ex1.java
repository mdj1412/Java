public class Ex1 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (sum < 100) {
            if (num % 2 == 0) {
                sum -= num;
            }
            else {
                sum += num;
            }
            num++;
        }
        num--;
        System.out.println("num=" + num);
        System.out.println("sum=" + sum);
    }
}