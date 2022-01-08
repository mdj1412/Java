import java.util.Queue;
import java.util.LinkedList;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        que.offer("Box");
        que.offer("Toy");
        que.offer("Robot");

        // XXX 예측

        System.out.println("next: " + que.peek());

        System.out.println(que.poll());
        System.out.println(que.poll());

        System.out.println("next: " + que.peek());

        System.out.println(que.poll());
    }
}
