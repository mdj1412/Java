public class Ex35 {
    public static void main(String args[]) {
        Calc c = new Calc(); 
        c.setValue(2, 5, '+'); 
        c.result(); 
        c.setValue(2, 5, '$'); 
        c.result(); 
        c.setValue(2, 5, '-'); 
        c.result();
        c.setValue(2, 5, '*'); 
        c.result(); 
        c.setValue(2, 5, '/'); 
        c.result();
    }
}

class Calc {
    private int x, y;
    private char operator;
    public void setValue(int x, int y, char operator) {
        this.x = x;
        this.y = y;
        this.operator = operator;
    }
    public int add() { return x + y; }
    public int sub() { return x - y; }
    public int mul() { return x * y; }
    public int div() { return x / y; }
    public void result() {
        switch (operator) {
        case '+': System.out.println("result = " + add()); break;
        case '-': System.out.println("result = " + sub()); break;
        case '*': System.out.println("result = " + mul()); break;
        case '/': System.out.println("result = " + div()); break;
        default: System.out.println("잘못된 연산자입니다.");
        }
    }
}