class Circle1 {
    double rad=0;           // private 아님
    final double PI = 3.14;

    private double rad0=0;

    public Circle1(double r){
        setRad(r);
    }

    public void setRad(double r){
        if (r<0){
            rad=0;
            return;
        }
        rad=r;
    }

    public double getArea(){
        return (rad * rad) * PI;
    }

    // 같은 클래스에 있는 main method를 실행하는 경우
    public static void main(String[] args){
        Circle1 c=new Circle1(1.5);
        System.out.println(c.getArea());

        c.setRad(2.5);
        System.out.println(c.getArea());
        c.setRad(-3.3);
        System.out.println(c.getArea());
        c.rad=-4.5;
        System.out.println(c.getArea());

        c.rad0=-4.5;            // 같은 class에 있기 때문에 private 의미가 없음
        System.out.println(c.rad0);
    }
}

class k{

    // class를 벗어날 때 정보 은닉 역할
    public static void main(String[] args){
        Circle1 c=new Circle1(1.5);
        System.out.println(c.getArea());

        c.setRad(2.5);
        System.out.println(c.getArea());
        c.setRad(-3.3);
        System.out.println(c.getArea());
        c.rad=-4.5;
        System.out.println(c.getArea());

        // c.rad0=-4.5;         // private instance variable
    }
}
