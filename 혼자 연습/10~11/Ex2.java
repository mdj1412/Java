public class Ex2 {
    public static void main(String[] args){
        CurrencyConverter.setRate(1121);
        System.out.println("환율1달러 : " + CurrencyConverter.getRate());
        System.out.println("백만원은 $" + CurrencyConverter.toDollar(1_000_000) + "입니다.");
        System.out.println("$120는 " + CurrencyConverter.toKW(120) + "원 입니다.");
    }
}

class CurrencyConverter {
    private static double rate;
    static void setRate(double rate){ CurrencyConverter.rate = rate; }
    static double getRate(){ return rate; }
    static double toDollar(double won){ return won / rate; }
    static double toKW(double dollar){ return dollar * rate; }
}