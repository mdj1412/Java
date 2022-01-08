class InstCnt {
    static int instNum = 0;         // XXX 클래스 변수 == static instance variable

    InstCnt() {                     // XXX constructor -> default
        instNum++;
        System.out.println("인스턴스 생성: " + instNum);
    }
}

class ClassVar {
    public static void main(String[] args){
        InstCnt cnt1 = new InstCnt();       // XXX 참조변수에 새로운 instance를 가리킴
        InstCnt cnt2 = new InstCnt();
        InstCnt cnt3 = new InstCnt();
    }
}

// XXX public class가 파일 이름과 동일
// XXX static main 함수가 속해 있는 클래스와 파일 이름과는 별개