

public class Ex5 {
    // isNumber 메서드를 작성하시오.
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str)); str = "1234x";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
    public static boolean isNumber(String str) {
        if ((str.equals("")) || (str == null)) return false;
        for (int i=0;i<str.length();i++) {
            if (str.substring(i, i+1).equals("0")) continue;
            else if (str.substring(i, i+1).equals("1")) continue;
            else if (str.substring(i, i+1).equals("2")) continue;
            else if (str.substring(i, i+1).equals("3")) continue;
            else if (str.substring(i, i+1).equals("4")) continue;
            else if (str.substring(i, i+1).equals("5")) continue;
            else if (str.substring(i, i+1).equals("6")) continue;
            else if (str.substring(i, i+1).equals("7")) continue;
            else if (str.substring(i, i+1).equals("8")) continue;
            else if (str.substring(i, i+1).equals("9")) continue; 
            else { return false; }
        }
        return true;
    }
}
