public class Ex41 {
    public static void main(String[] args) {
        String text = "I love you";
        int length = text.length();
        for (int i=0;i<length;i++) {
            System.out.println((text+text).substring(1+i, 1+length+i));
        }
    }
}
