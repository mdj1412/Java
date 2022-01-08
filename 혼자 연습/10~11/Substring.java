class SubString {
    public static void main(String[] args){
        String str = "abcdefg";

        System.out.println(str.substring(2));       // XXX 예측
        System.out.println(str);
        System.out.println(str.substring(2, 4));    // XXX 예측
        System.out.println(str);
    }
}
