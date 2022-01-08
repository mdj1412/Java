package A7;                         // XXX 전체 파일에서 실행

class A0{
    public static void main(String[] args){
        String str1 = "Happy";
        String str2 = "Birthday";
        System.out.println(str1 + " " + str2);

        printString(str1);
        printString(str2);
    }

    public static void printString(String str){
        System.out.println(str);
    }
}