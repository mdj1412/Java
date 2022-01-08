public class Ex3 {
    public static void main(String[] args){
        String text1 = "eW";
        String text2 = "LOVE";
        String text3 = "C++";
        String text4 = "    programming.    ";

        StringBuilder stbuf = new StringBuilder(text1);
        stbuf.reverse();
        stbuf.append(" ").append(text2.toLowerCase()).append(text3);
        stbuf.replace(7, 10, " JAVA ");
        stbuf.append(text4.trim());

        String answer = stbuf.toString();
        System.out.println(answer);
        // System.out.println(stbuf); String으로 자동 변환
    }
}
