class PrefixOp{
    public static void main(String[] args){
        int num=7;
        System.out.println(++num);
        System.out.println(++num);
        System.out.println(num);

        /* 추가 예제 */
        short n1=5;
        float n2=10f;
        short n3=n1++;
        float n4=n2++;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}
