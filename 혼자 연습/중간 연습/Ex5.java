public class Ex5 {
    public static void main(String[] args) {
        Gate[] gate = { new andGate(true, false), 
                        new orGate(true, false),
                        new xorGate(true, false) }; 
        for(Gate g : gate) {
            System.out.println(g.operator() + " = " + g.operation()); 
        }
    }
}

class Gate {
    private boolean a, b;

    public Gate(boolean a, boolean b) {
        this.a = a;
        this.b = b;
    }
    public String operator() { return ""; }
    public boolean operation() { return true; }
    public Boolean getA() { return a; }
    public Boolean getB() { return b; }
}

class andGate extends Gate {
    public andGate(boolean a, boolean b) {
        super(a, b);
    }

    @Override
    public String operator() { return getA() + " & " + getB() + " = "; }
    @Override
    public boolean operation() { return getA() & getB(); }

}

class orGate extends Gate {
    public orGate(boolean a, boolean b) {
        super(a, b);
    }

    @Override
    public String operator() { return getA() + " | " + getB() + " = "; }
    @Override
    public boolean operation() { return getA() | getB(); }
}

class xorGate extends Gate {
    public xorGate(boolean a, boolean b) {
        super(a, b);
    }

    @Override
    public String operator() { return getA() + " ^ " + getB() + " = "; }
    @Override
    public boolean operation() { return getA() ^ getB(); }
}