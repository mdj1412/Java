public class Ex2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Strawberry Grape Pear Apple");
        System.out.println("StringBuffer : " + sb);
        sb.delete(16, 25);
        System.out.println("StringBuffer : " + sb);
    }
}
