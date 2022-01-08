import java.util.HashSet;

class Car {
    private String model;
    private String color;
    
    public Car(String m, String c) { model = m; color = c; }

    @Override // class Object
    public String toString() { return model + " : " + color; }
    @Override // class Object
    public int hashCode() { return (model.hashCode() + color.hashCode()) / 2; }
    @Override // class Object
    public boolean equals(Object obj) {
        String m = ((Car)obj).model;
        String c = ((Car)obj).color;

        if (model.equals(m) && color.equals(c)) { return true; }
        else { return false; }
    }
}

public class HowHashCode {
    public static void main(String[] args) {
        HashSet<Car> set = new HashSet<>();
        set.add(new Car("HY_MD_301", "RED"));
        set.add(new Car("HY_MD_301", "BLACK"));
        set.add(new Car("HY_MD_302", "RED"));
        set.add(new Car("HY_MD_302", "WHITE"));
        set.add(new Car("HY_MD_301", "BLACK"));
        System.out.println("인스턴스 수: " + set.size());

        for (Car car : set) { System.out.println(car.toString() + '\t'); }
        System.out.println();

        for (Car car : set) { System.out.println(car + "\t"); }
        System.out.println();
        // XXX 위와 아래의 차이점
        // for (Car car : set) { System.out.println(car + '\t'); }
        System.out.println();
    }
}
