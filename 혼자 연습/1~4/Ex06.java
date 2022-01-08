class Ex06{
    /* bit operator */
    public static void main(String[] args){
        byte n1=0B101111;                           // 47(10)==101111(2)
        byte n2=0B10101;                            // 21(10)==010101(2)
        
        System.out.println("& 결과 : " + (n1&n2));   // n1&n2 ==000101(2)== 5(10)
        System.out.println("| 결과 : " + (n1|n2));   // n1|n2 ==111111(2)==63(10)
    }
}
