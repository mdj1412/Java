package A7;                                 // XXX 전체 파일에서 실행

class BankAccount00{
    public static void main(String[] args){
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();

        yoon.deposit(5000);
        park.deposit(3000);

        yoon.withdraw(2000);
        park.withdraw(2000);

        yoon.checkyMyBalance();
        park.checkyMyBalance();
    }
}
