package A7;                             // XXX 전체 파일에서 실행

class DupRef{
    public static void main(String[] args){
        BankAccount ref1 = new BankAccount();
        BankAccount ref2 = ref1;

        ref1.deposit(3000);
        ref2.deposit(2000);
        ref1.withdraw(400);
        ref2.withdraw(300);
        ref1.checkyMyBalance();
        ref2.checkyMyBalance();
    }
}