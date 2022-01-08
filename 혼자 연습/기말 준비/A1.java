import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;


public class A1 {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>((Arrays.asList(1, 2, 3, 4, 5))); 
        Set<Integer> B = new HashSet<>((Arrays.asList(2, 4, 6, 8, 10))); 
        Set<Integer> C = new HashSet<>((Arrays.asList(2, 3, 5, 7, 11))); 
        Set<Integer> D = new HashSet<>((Arrays.asList(1, 3, 5, 7, 9)));

        System.out.print("A = ");
        System.out.println(A);
        System.out.print("B = ");
        System.out.println(B);
        System.out.print("C = ");
        System.out.println(C);
        System.out.print("D = ");
        System.out.println(D);

        A.removeAll(B);
        System.out.print("A - B = ");
        System.out.println(A);

        C.retainAll(D);
        System.out.print("C ∩ D = ");
        System.out.println(C);

        A.addAll(C);
        System.out.print("(A - B) U (C ∩ D) = ");
        System.out.println(A);
    }
}
