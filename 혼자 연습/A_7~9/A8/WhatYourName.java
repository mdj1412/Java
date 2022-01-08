     package A8;                            // XXX 전체 파일에서 실행

class AAA {
    public AAA(){
        System.out.println("AAA");
    }
    public void showName(){
        System.out.println("AAA : showName()");
    }
}
class ZZZ{
    public ZZZ(){
        System.out.println("ZZZ");
    }
    public void showName(){
        System.out.println("ZZZ : showName()");
    }
}

class WhatYourName{
    public static void main(String[] args){
        AAA aaa = new AAA();
        aaa.showName();

        ZZZ zzz = new ZZZ();
        zzz.showName();
    }
}