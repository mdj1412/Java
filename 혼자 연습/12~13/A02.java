public class A02 {
    public static void main(String[] args){
        Box[] ar = new Box[5];
        System.out.println("length : " + ar.length);


        ar[0] = new Box("First");
        ar[1] = new Box("Second");
        ar[2] = new Box("Third");

        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);
    }
}

// XXX 인스턴스 대상 1차원 배열 ===>> 이유