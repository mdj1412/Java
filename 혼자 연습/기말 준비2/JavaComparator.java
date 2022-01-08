import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Player3 {
    String name;
    int score;
    
    public Player3(String name, int score){
        this.name = name;
        this.score = score;
    }
    public String toString() {
        return name + " " + score;
    }
}

class Checker implements Comparator<Player3> {
    @Override
    public int compare(Player3 p1, Player3 p2) {
        if (p1.score == p2.score) { 
            return p1.name.compareTo(p2.name);
        }
        return p2.score - p1.score;
    }
}

public class JavaComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Player3> list = new ArrayList<>();
        
        for (int i=0;i<count;i++) {
            list.add(new Player3(sc.next(), sc.nextInt()));
        }
        Collections.sort(list, (a, b) -> b.score - a.score);
        // Collections.sort(list, new Checker());
        System.out.println("here");
        for (Player3 e : list) { System.out.println(e); }
    }
}
