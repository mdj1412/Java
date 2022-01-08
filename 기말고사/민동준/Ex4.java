import java.util.ArrayList;
import java.util.Queue;

public class Ex4 {
    public static void main(String[] args) {
        int size=10;

        GQueue<String> stringQueue = new GQueue<>(size); 
        stringQueue.enqueue("seoul"); 
        stringQueue.enqueue("busan"); 
        stringQueue.enqueue("LA");

        for(int i=0; i<size; i++) {
            String str = stringQueue.dequeue(); 
            if(str != null) System.out.println(str);
        }

        GQueue<Integer> intQueue = new GQueue<>(size); 
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        
        for(int i=0; i< size; i++) {
            Integer is = intQueue.dequeue(); 
            if(is != null) System.out.println(is);
        }
    }
}

class GQueue<T> {
    T[] array;
    int last, first;
    public GQueue(int s) {
        array = (T[])new Object[s];
        for (int i=0;i<s;i++) { array[i] = null; }
        last = 0; first = -1;
    }
    public T dequeue() {
        if (first == -1) { return null; }
        T answer = array[first];
        array[first] = null;
        first++;
        return answer;
    }
    public boolean enqueue(T a) {
        if (first == last) { return false; }
        if (first == -1) { first = 0; }
        array[last++] = a;
        return true;
    }
}