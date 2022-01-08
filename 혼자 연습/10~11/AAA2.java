

// import static java.lang.Math;

// ??? 클래스를 static으로 가져오지 않나

import static java.lang.Math.PI;

class AAA2 {
    public static void main(String[] args){
        System.out.println("case 1 :");
        System.out.println(Math.PI);                // XXX 이미 컴파일러가 java.lang은 삽입해줌
        System.out.println(java.lang.Math.PI);


        System.out.println("case 2 :");
        System.out.println(PI);                     // XXX 위의 static import의 영향
        System.out.println(Math.PI);
    }
}
