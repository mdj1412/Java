class EscapeSequences {
    public static void main(String[] args){
        System.out.println("AB" + '\b' + 'C');
        System.out.println("AB" + '\t' + 'C');
        System.out.println("AB" + '\n' + 'C');
        System.out.println("AB" + '\r' + 'C');

        /* μμ μΆκ° */
        System.out.println("abcde\rxyz");
        System.out.println("abcde\bxyz");
    }
}
