public class Ex2 {
    public static void main(String[] args) {
        PairGen<String, Integer> p1 = new PairGen<>("Apple", 3); 
        PairGen<String, Integer> p2 = new PairGen<>("Apple", 3); 
        System.out.println(CompareGen.compare(p1, p2));

        PairGen<String, String> p3 = new PairGen<>("객체지향", "Java"); 
        PairGen<String, String> p4 = new PairGen<>("객체지향", "C++"); 
        System.out.println(CompareGen.compare(p3, p4));
    }
}

class PairGen<K, V> {
    private K key;
    private V value;

    public PairGen(K k, V v) { key = k; value = v; }
    public K getKey() { return key; }
    public V getValue() { return value; }
}

class CompareGen {
    public static <K, V> boolean compare(PairGen<? extends K, ? extends V> g1, PairGen<? extends K, ? extends V> g2) {
        return (g1.getKey().equals(g2.getKey()) && (g1.getValue().equals(g2.getValue())));
    }
}