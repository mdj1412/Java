class BankAccount{
    String accNumber;
    String ssNumber;
    int balance=0;          // static 선언 차이
    
    public BankAccount(){
        // 다른 파일 오류 발생 때문에 function overloading 
    }

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
    public int checkMyBalance(){
        System.out.println("잔액 : "+balance);
        return balance;
    }
}
