class StringValueOf {
    public static void main(String[] args){
        double e = 2.718281;
        String se = String.valueOf(e);
        System.out.println(se);

        // XXX String class는 instance 자체가 변경되지 않는다.
        // XXX 반면 StringBuilder class나 StringBuffer class는 instance가 바뀐다.
        double a = 1.4;
        double b = 2.5;
        System.out.println(a+b);

        String.valueOf(a);
        String.valueOf(b);
        System.out.println(a+b);

        System.out.println(String.valueOf(a)+String.valueOf(b));
    }
}
