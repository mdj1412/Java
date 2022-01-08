import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CopyList {
    public static void main(String[] args) {
        List<String> src = Arrays.asList("Box", "Apple", "Toy", "Robot");

        List<String> dest = new ArrayList<>(src);       // XXX copy constructor , deep copy
        
        Collections.sort(dest);

        System.out.print("src : ");
        System.out.println(src);
        System.out.print("dest : ");
        System.out.println(dest);

        Collections.copy(dest, src);

        System.out.print("src : ");
        System.out.println(src);
        System.out.print("dest : ");
        System.out.println(dest);
    }
}
