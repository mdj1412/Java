package A8;                             // XXX 전체 파일에서 실행

import A8.com.wxfx.smart.Circle;       // XXX 잠시 수정
// import com.fxmx.simple.Circle;      // XXX 오류 발생
import A8.com.fxmx.simple.*;           // XXX 오류 발생하지 않음         // XXX 잠시 수정


class ImportCircle {
    public static void main(String[] args){
        Circle c1 = new Circle(3.5);
        System.out.println("반지름 3.5 원 넓이: " + c1.getArea());
        Circle c2 = new Circle(5.5);
        System.out.println("반지름 5.5 원 넓이: " + c2.getArea());

        A8.com.fxmx.simple.Circle c3 = new A8.com.fxmx.simple.Circle(5.5);      // XXX 이것도 클래스 패스 기준으로 생각, 위의 import를 하는 것과 비슷하도고 생각하면 좋음
        System.out.println("다른 방법으로 instance 선언: " + c3.getPerimeter());
    }
}