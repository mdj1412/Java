package A9;
// import A9.zoo.Dog;
// import A9.zoo.*;

public class Animal {
    public static void main(String[] args){

        A9.zoo.Dog dog = new A9.zoo.Dog();      // import안할 경우
        // Dog dog = new Dog();                // XXX cpp랑 다르게 무조건 소괄호 작성

        dog.makeSound();
        // zoo.Duck duck = new zoo.Dock();      // XXX public class와 default class의 차이
    }
}

// XXXXX
// 경우 1) import할 때 class까지 해야됨                     ex) import A9.zoo.Dog
// 경우 2) 파일을 까지 할거면 뒤에 .* 전체 import하기           ex) import A9.zoo.*