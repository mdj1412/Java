package A9;                                 // XXX 전체 파일에서 실행

class Circle {
    private double rad = 0;
    final double PI = 3.14;

    public Circle(double r){
        setRad(r);              // XXX 바로 대입하면 안됨, 과제에서 비슷한 문제 있음
    }
    public void setRad(double r){
        if (r<0){
            rad = 0;
            return;
        }
        rad=r;
    }
    public double getRad(){ return rad; }
    public double getArea(){ return rad*rad*PI; }
}
