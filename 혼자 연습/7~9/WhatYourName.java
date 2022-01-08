import MyClass.*;

class WhatYourName{
    public static void main(String[] args){

        // 같은 클래스 이름 때문에 import를 했음에도 불구하고 클래스 접근 사용
        MyClass.AAA aaa=new MyClass.AAA();
        aaa.showName();

        MyClass.ZZZ zzz=new MyClass.ZZZ();
        zzz.showName();
    }
}