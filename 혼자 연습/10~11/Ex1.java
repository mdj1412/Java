public class Ex1 {
    public static void main(String[] args){
        String text = "I love you";
        text += text;
        for (int i=1;i<11;i++)
            System.out.println(text.substring(i, i+10));
    }
}


/* 

int len = text.length();
for (int i=0;i<len;i++){
    String first = text.substring(0,1);
    String last = text.substring(1);
    text = last + first;
    System.out.println(text);
}

*/