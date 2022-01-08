class EscapeSequences {
    public static void main(String[] args){
        System.out.println("AB" + '\b' + 'C');
        System.out.println("AB" + '\t' + 'C');
        System.out.println("AB" + '\n' + 'C');
        System.out.println("AB" + '\r' + 'C');

        /* 예시 추가 */
        System.out.println("abcde\rxyz");
        System.out.println("abcde\bxyz");
    }
}
