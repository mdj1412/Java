package A9.animal;

public class Dog {
    public void welcome(A9.zoo.Cat c){
        c.makeSound();
        // c.makeHappy();       // XXX 다른 package에 있는 default함수이기 때문에 오류
    }
}
