public class C2 {
    public static void main(String[] args) {
        PairGen<String, Integer> p1 = new PairGen<>("Apple", 3); 
        PairGen<String, Integer> p2 = new PairGen<>("Apple", 3); 
        System.out.println(CompareGen.compare(p1, p2));

        PairGen<String, String> p3 = new PairGen<>("객체지향", "Java"); 
        PairGen<String, String> p4 = new PairGen<>("객체지향", "C++"); 
        System.out.println(CompareGen.compare(p3, p4));
    }
}

class CompareGen {
    public static <K,V> boolean compare(PairGen<? extends K, ? extends V> p1, PairGen<? extends K, ? extends V> p2) {
        if ((p1.getKey().equals(p2.getKey())) && (p1.getValue().equals(p2.getValue()))) { 
            return true; 
        }
        else { return false; }
    }
}

class PairGen<K, V> {
    private K key;
    private V value;

    public PairGen(K key, V value) { this.key = key; this.value = value; }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}