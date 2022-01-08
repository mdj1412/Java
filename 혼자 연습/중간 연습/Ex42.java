public class Ex42 {
    public static void main(String[] args) {
        CurrencyConverter.setRate(1121);
        System.out.println("환율1달러 : " + CurrencyConverter.getRate()); 
        System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다."); 
        System.out.println("$120는 " + CurrencyConverter.toKW(120) + "원 입니다.");
    }
}

class CurrencyConverter {
    private static double rate;
    
    public static void setRate(double rate) { CurrencyConverter.rate = rate; }
    public static double getRate() { return rate; }
    public static double toDollar(double won) { return won / rate; }
    public static double toKW(double dollar) { return dollar * rate; }
}