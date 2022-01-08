public class Ex4 {
    public static void main(String[] args) {
        Circle a = new Circle(2, 3, 30); 
        Circle b = new Circle(5); 
        Circle c = new Circle(2, 3);

        System.out.println("원 a : " + a); 
        System.out.println("원 b : " + b); 
        System.out.println("원 c : " + c);

        if (a.equals(b)) 
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
        if (a.equals(c))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원"); 
    }
}

class Circle {
    private int x;
    private int y;
    private int r;

    public Circle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public Circle(int r){ this(0, 0, r); }
    public Circle(int x, int y){ this(x, y, 5); }

    public String toString(){
        return "Circle(" + x + "," + y + ") 반지름" + r;
    }
    public boolean equals(Circle compare){
        if ((x == compare.x) && (y == compare.y))
            return true;
        return false;
    }
}