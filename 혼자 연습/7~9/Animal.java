public class Animal {
    public static void main(String[] args){
        zoo.Dog dog=new zoo.Dog();
        dog.makeSound();
        // zoo.Duck duck=new zoo.Duck();
        // duck.makeSound();
    }
}

// class 에서 선언 방식의 차이
// public 선언 == 어디서든 인스턴스 생성이 가능
// default 선언 == 동일 패키지로 묶인 크래스 내에서만 인스턴스 생성을 허용

