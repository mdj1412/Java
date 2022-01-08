class CompAssignOp{
    public static void main(String[] args){
        short num=10;
        num=(short)(num+77L);                   // 형 변환 안하면 컴파일 오류 발생
        int rate=3;
        rate=(int)(rate*3.5);                   // 형 변환 안하면 컴파일 오류 발생
        System.out.println(num);
        System.out.println(rate);

        num=10;
        num+=77L;                               // 형 변환 필요하지 않다.
        rate=3;
        rate*=3.5;                              // 형 변환 필요하지 않다.
        System.out.println(num);
        System.out.println(rate);





        /* 복합 대입 연산자 추가 */
        System.out.println("\n< next example >");
        int A=12, B=10;
        int result;

        result=A&B;
        System.out.println(result);
        result=A^B;
        System.out.println(result);
        result=A<<B;
        System.out.println(result);
        result=A>>>B;
        System.out.println(result);

        // System.out.println(2.0<<2.0);            // (웬만하면 int type) ---  https://catch-me-java.tistory.com/23

        /* 
        https://tcpschool.com/java/java_operator_assignment
        https://secretroute.tistory.com/entry/자바의神-Vol1-비트-시프트-연산자
        */
    }
}
