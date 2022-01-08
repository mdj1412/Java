class Man { 
    String name;

    public Man(String name) { 
        System.out.println("상위클래스");
        this.name = name; 
    }
    public void tellYourName() {
        System.out.println("My name is " + name); 
    }
}
class BusinessMan extends Man { 
    String company;
    String position;

    public BusinessMan(String name, String company, String position) {
        super(name);
        System.out.println("하위클래스");
        this.company = company;
        this.position = position;
    }

    public void tellYourInfo() {
        System.out.println("My company is " + company); System.out.println("My position is " + position); tellYourName();
    } 
}

public class Ex {
    public static void main(String[] args) {
        BusinessMan a = new BusinessMan("mindongjun", "ko", "position");
        
    }
}
