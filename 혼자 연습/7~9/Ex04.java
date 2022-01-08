public class Ex04{
    public static void main(String[] args){
        Circle c1 = new Circle("Pizza", 0);                             // 참조변수 c1 선언 후 인스턴스 생성
        Circle c2 = new Circle("donut", 0);                             // 참조변수 c2 선언 후 인스턴스 생성
        Circle c3 = new Circle("hamburger", 0);                         // 참조변수 c3 선언 후 인스턴스 생성

        c1.setRad(12);
        c2.setRad(-2);
        c3.setRad(7);

        c1.show();
        c2.show();
        c3.show();

        double gA1 = c1.getArea();
        double gA2 = c2.getArea();
        double gA3 = c3.getArea();

        if (gA1 > gA2){
            if (gA1 > gA3)
                printString(c1);
            else
                printString(c3);
        }
        else{
            if (gA2 > gA3)
                printString(c2);
            else
                printString(c3);
        }

    }
    public static void printString(Circle c){
        System.out.println("가장 큰 면적은 " + c.getName());
    }
}

class Circle{
    private String name;
    private double radius;
    private final double PI = 3.14;                                 // literal constant
    
    public Circle(String n, double r){
        name=n;
        radius=r;
    }
    public void setRad(double rad){ radius = (rad>0)? rad : 0; }
    public String getName(){ return name; }
    public double getArea(){ return radius * radius * PI; }
    public void show(){
        System.out.println(getName() + "넓이 : " + getArea());
    }
}