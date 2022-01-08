import java.lang.Math;

public class E04 {
    public static void main(String[] args) { 
        Circle c1 = new Circle("Pizza", 0); 
        Circle c2 = new Circle("donut", 0); 
        Circle c3 = new Circle("hamburger", 0);
        
        c1.setRad(12); 
        c2.setRad(-2); 
        c3.setRad(7);

        c1.show();
        c2.show();
        c3.show();

        if (c1.getArea() > c2.getArea()){
            if (c1.getArea() > c3.getArea())
                System.out.println("가장 큰 면적은 " + c1.getName());
            else
                System.out.println("가장 큰 면적은 " + c3.getName());
        }
        else {
            if (c2.getArea() > c3.getArea())
                System.out.println("가장 큰 면적은 " + c2.getName());
            else
                System.out.println("가장 큰 면적은 " + c3.getName());
        }

    }
    
}

class Circle {
    private double radius;
    private String name;

    public Circle(String n, double r){
        name = n;
        this.setRad(r);                         // XXX constructor로 선언할 때 setRad 불러오기
    }
    public void setRad(double rad){ 
        if (rad<0) rad = 0;
        radius = rad; 
    }
    public String getName(){ return name; }
    public double getArea(){ return radius * radius * 3.14; };
    public void show(){ System.out.println(name + "넓이 : " + getArea() ); }
}