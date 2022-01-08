import java.util.Scanner;

public class Hc {
    public static void main(String[] args){
        System.out.println("한영 단어 검색 프로그램입니다.");
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("한글 단어?");
            String answer = sc.nextLine();
            if(answer.equals("그만")){break;}
            else System.out.println(Dictionary1.kor2Eng(answer));           // XXX 같은 패키지에 클래스가 겹쳐서
        }
        sc.close();
    }
}

class Dictionary1 {
    private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
    private static String[] eng = { "love", "baby", "money", "future", "hope" };

    public static String kor2Eng(String word) {
        if(kor[0].equals(word)){ return eng[0];}
        else if (kor[1].equals(word)){ return eng[1];}
        else if (kor[2].equals(word)){ return eng[2];}
        else if (kor[3].equals(word)){ return eng[3];}
        else if (kor[4].equals(word)){ return eng[4];}
        else return word.concat("는 저의 사전에 없습니다.");
    }
}
