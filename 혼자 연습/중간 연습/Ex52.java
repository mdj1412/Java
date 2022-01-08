import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        System.out.println("한영 단어 검색 프로그램입니다.");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("한글 단어?");
            String word = sc.nextLine();
            if (word.equals("그만"))
                break;
            System.out.println(word + Dictionary.kor2Eng(word));
        }
        
    }
}

class Dictionary {
    private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
    private static String [] eng = { "love", "baby", "money", "future", "hope" };
    public static String kor2Eng(String word) {
        int length = kor.length;
        for (int i=0;i<length;i++) {
            if (word.equals(kor[i]))
                return "은 " + eng[i];
        }
        return "는 저의 사전에 없습니다.";
    }
}