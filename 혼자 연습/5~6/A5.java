class A5{
    public static void main(String[] args){
        int num=0;
        while (num<5){
            System.out.println("I like Java " + num);
            num++;
        }

        num=0;
        do{
            System.out.println("I like Java " + num);
            num++;
        } while (num<5);                                        // 마지막에 세미콜론
    
        for (int i=0;i<5;i++){{
            System.out.println("I love Java " + i);
        }}
    
    }
}
