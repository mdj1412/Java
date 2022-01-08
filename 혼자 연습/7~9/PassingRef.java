class PassingRef{
    public static void main(String[] args){
        BankAccount ref=new BankAccount();
        ref.deposit(3000);
        ref.withdraw(300);
        check(ref);

        // 참조변수에 null 대입
        ref=null;
        if (ref==null){
            System.out.println("Ok");
        }
    }
    public static void check(BankAccount acc){
        acc.checkMyBalance();
    }
}