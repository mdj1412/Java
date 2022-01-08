public class A06 {
    public static void main(String[] args) {

        String[] arr = new String[] { };
        Simple.main(arr);
        System.out.println();
        
        arr = new String[] {"Coffee", "Milk", "Orange"};        // 배열 생성과 동시에 초기화
        Simple.main(arr);
        System.out.println();

        arr = new String[] {"Coffee", "Milk", "Orange", "Min", "Dong", "Jun"};
        Simple.main(arr);
        System.out.println();

        String[] arr2 = {"Min", "Dong", "Jun"};                 // 배열 생성과 동시에 초기화
        // XXX 선언하자마자 초기화할 때만 사용 가능 (밑에 예제 arr1)
        Simple.main(arr2);
        System.out.println();

        String[] arr1 = new String[3];
        // arr1 = {"Min", "Dong", "Jun"};
        
        // XXX 동시에 선언 및 초기화
        // XXX 선언하고 다음에 초기화는 불가능
    }
}
