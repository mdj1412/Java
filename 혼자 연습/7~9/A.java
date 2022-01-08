class A {
    // class 내부에서 static 선언의 차이(2 가지)
    // instance variable and instance method(static 먼저 데이터 영역에 저장되기 때문에 만약 instance variable을 static하지 않은 상황에서 static instance method에서 그 변수를 사용한다면 오류)
    // class instance에서 static은 서로 공유(class에 대한 instance를 두 개 선언해서 값을 바꾸면 모든 instance 값들이 바뀜)
    public static void main(String[] args){

        BankAccount ref1=new BankAccount();     // reference variable   (pointer처럼 생각하는게 좋음)
        BankAccount ref2=ref1;                  // reference variable   (pointer처럼 생각하는게 좋음)
        ref1.deposit(3000);
        ref2.deposit(2000);
        ref1.withdraw(400);
        ref2.withdraw(300);
        ref1.checkMyBalance();
        ref2.checkMyBalance();
        
        func(ref1);
        ref1.checkMyBalance();
        ref2.checkMyBalance();

        System.out.println("case 2");
        ref1=new BankAccount();
        ref1.checkMyBalance();
        ref2.checkMyBalance();
        ref2=new BankAccount();                 // (GC) garbage collector

        




        System.out.println(12.0*12.0*3.14);
        System.out.println((12.0*12.0)*3.14);
        System.out.println(144.0*3.14);

        System.out.println(12.0*(12.0*3.14));
        System.out.println(12.0*3.14);
        System.out.println(12.0*37.68);
        System.out.println(37.68*12.0);





    }
    
    public static void func(BankAccount ref){   // pointer로 생각하는게 맞음 (pointer의 특징은 사용X)
        ref.deposit(10_000);
    }

    // parameter variable
    public static void printString(String s){
        System.out.println(s);
    }
}
