class AccessWay {
    static int num = 0;                 // XXX 클래스 변수 == static instance variable

    AccessWay() { incrCnt(); }
    void incrCnt(){
        num++;
    }
}

class ClassVarAccess {
    public static void main(String[] args){
        AccessWay way = new AccessWay();
        way.num++;
        AccessWay.num++;                                    // XXX class 이름을 통한 접근가능
        System.out.println("num = " + AccessWay.num);       // XXX class 이름을 통한 접근가능
    }
}