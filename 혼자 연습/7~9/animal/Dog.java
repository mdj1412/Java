package animal;

public class Dog {
    public void makeSound(){
        System.out.println("bowwow~");
    }

    public static void welcome(zoo.Cat c){
        c.makeSound();
        // c.makeHappy();   // default이기 때문에 다른 package에서 사용 불가능
    }

    public static void main(String[] args){
        zoo.Cat c = new zoo.Cat();
        welcome(c);
    }
}