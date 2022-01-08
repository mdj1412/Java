package A7;                             // XXX 전체 파일에서 실행

class BankAccount{
    String accNumber;
    String ssNumber;
    int balance = 0;

    public BankAccount(){}
    public BankAccount(String acc, String ss, int bal){
        accNumber=acc;
        ssNumber=ss;
        balance=bal;
    }
    public void initAccount(String acc, String ss, int bal){
        accNumber=acc;
        ssNumber=ss;
        balance=bal;
    }
    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    public int checkyMyBalance(){
        System.out.println("잔액 : " + balance);
        return balance;
    }
}

class PassingRef{
    public static void main(String[] args){
        BankAccount ref = new BankAccount();
        ref.deposit(3000);
        ref.withdraw(300);
        check(ref);
    }

    public static void check(BankAccount acc){
        acc.checkyMyBalance();
    }
}