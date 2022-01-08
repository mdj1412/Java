public class Ex75 {
    public static void main(String[] args) {
        Gate1[] gate = { new andGate1(true, false), 
            new orGate1(true, false),
            new xorGate1(true, false) }; 
        for(Gate1 g : gate) {
            System.out.println(g.operator() + " = " + g.operation());
        }
    }
}

class andGate1 extends Gate1 {
    public andGate1(boolean a, boolean b) { super(a, b); }
    @Override
    public String operator() { return "&"; }
    @Override
    public boolean operation() { return getA()&getB(); }
}

class orGate1 extends Gate1 {
    public orGate1(boolean a, boolean b) { super(a, b); }
    @Override
    public String operator() { return "|"; }
    @Override
    public boolean operation() { return getA()|getB(); }
}

class xorGate1 extends Gate1 {
    public xorGate1(boolean a, boolean b) { super(a, b); }
    @Override
    public String operator() { return "^"; }
    @Override
    public boolean operation() { return getA()^getB(); }
}

class Gate1 {
    private boolean a, b;
    public Gate1(boolean a, boolean b) {
        this.a = a;
        this.b = b;
    }
    public boolean getA() { return a; }
    public boolean getB() { return b; }
    public String operator() { return ""; }
    public boolean operation() { return true; }
}