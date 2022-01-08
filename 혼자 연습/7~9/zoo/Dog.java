package zoo;

public class Dog {
    public void makeSound(){
        System.out.println("bowwow~");
    }

    public static void welcome(zoo.Cat c){
        c.makeSound();
        c.makeHappy();          // default지만 같은 package여서 사용 가능
    }

    public static void main(String[] args){
        Cat c = new Cat();
        welcome(c);
    }
}

class Duck{
    public void makeSound(){
        System.out.println("quack~");
    }
}
