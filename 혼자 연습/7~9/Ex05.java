public class Ex05{
    public static void main(String args[]){
        Calc c = new Calc();                        // 참조변수 c 선언 후 인스턴스 생성
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

class Calc{
    private int value1;
    private int value2;
    private char operator;

    public void setValue(int val1, int val2, char oper){
        value1 = val1;
        value2 = val2;
        operator = oper;
    }
    public void result(){
        switch (operator){
        case '+':
            System.out.println("result = " + add());
            break;
        case '-':
            System.out.println("result = " + sub());
            break;
        case '*':
            System.out.println("result = " + mul());
            break;
        case '/':
            System.out.println("result = " + div());
            break;
        default:
            System.out.println("잘못된 연산자입니다.");
        }
    }
    public int add(){ return value1 + value2; }
    public int sub(){ return value1 - value2; }
    public int mul(){ return value1 * value2; }
    public int div(){ return value1 / value2; }
}