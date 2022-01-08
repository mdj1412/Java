import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        int size=10;
        GStack<String> stringStack = new GStack<String>(size);

        stringStack.push("seoul"); 
        stringStack.push("busan"); 
        stringStack.push("LA");

        for(int i=0; i<size; i++) {
            String str = stringStack.pop();
            if(str != null) System.out.println(str);
        }

        GStack<Integer> intStack = new GStack<Integer>(size); 
        intStack.push(1);
        intStack.push(3);
        intStack.push(5);

        for(int i=0; i<size; i++) {
            Integer is = intStack.pop();
            if(is != null) System.out.println(is);
        }
    }
}

class GStack<T> {
    private Object[] list;
    private int idx;

    public GStack(int size) {
        list = new Object[size];
        idx = 0;
    }
    public void push(T n) {
        if (idx == list.length) { return; }     // stack overflow
        list[idx++] = n;
    }
    public T pop() {
        if (idx == 0) { return null; }          // stack underflow
        return (T)list[--idx];
    }
}

// class GStack<T> {
//     private T[] list;
//     private int idx;

//     public GStack(int size) {
//         // list = new T[size];
//         // @SuppressWarnings("unchecked")
//         list = (T[])new Object[size];
//         idx = 0;
//     }
//     public void push(T n) {
//         if (idx == list.length) { return; }
//         list[idx++] = n;
//     }
//     public T pop() {
//         if (idx == 0) { return null; }
//         return list[--idx];
//     }
// }