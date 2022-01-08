public class Ex43 {
    public static void main(String[] args) {
        String text1 = "eW";
        String text2 = "LOVE";
        String text3 = "C++";
        String text4 = "programming.";

        StringBuilder sb = new StringBuilder();

        sb.append(text1);
        sb.reverse();
        sb.append(" ").append(text2.toLowerCase()).append(text3);
        sb.replace(7, 10, " JAVA ");
        sb.append(text4.trim());

        System.out.println(sb.toString());
    }
}
