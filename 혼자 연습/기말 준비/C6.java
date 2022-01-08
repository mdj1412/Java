public class C6 {
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
    private int idx;
    private Object[] arr;

    public GStack(int size) { 
        idx = 0;
        arr = new Object[size];
    }
    public void push(T value) {
        if (idx < arr.length) { arr[idx++] = value; }
        else { System.out.println("초과했습니다."); }
    }
    public T pop() {
        if (idx != 0) { return (T)arr[--idx]; }
        else { return null; }
    }
}
