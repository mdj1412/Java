public class E05 {
    public static void main(String[] args){
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
    private int a, b;
    private char o;

    public void setValue(int a, int b, char o){
        this.a = a;
        this.b = b;
        this.o = o;
    }
    public void result(){
        switch (o){
        case '+':
            System.out.println("result = " + (a+b));
            break;
        case '-':
            System.out.println("result = " + (a-b));
            break;
        case '*':
            System.out.println("result = " + (a*b));
            break;
        case '/':
            System.out.println("result = " + (a/b));
            break;
        default:
            System.out.println("잘못된 연산입니다.");
        }
    }
}