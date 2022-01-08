import java.util.TreeSet;
import java.util.Iterator;

public class SortedTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(3); tree.add(1);
        tree.add(2); tree.add(4);
        System.out.println("인스턴스 수: " + tree.size());

        for (Integer n : tree) { System.out.print(n.toString() + '\t'); }
        System.out.println();

        for (Iterator<Integer> itr = tree.iterator(); itr.hasNext(); ) {
            System.out.print(itr.next().toString() + '\t');
        }
        System.out.println();

        for (Iterator<Integer> itr = tree.iterator(); itr.hasNext(); ) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        // XXX 위와 아래의 차이점 !!!
        for (Iterator<Integer> itr = tree.iterator(); itr.hasNext(); ) {
            System.out.print(itr.next() + '\t');
        }
        System.out.println();
        for (Iterator<Integer> itr = tree.iterator(); itr.hasNext(); ) {
            System.out.print(itr.next());
        }
        System.out.println();
    }
}
// 1 0 1 1 1 2 1 3