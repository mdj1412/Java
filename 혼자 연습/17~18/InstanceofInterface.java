class SimplePrinter2 implements Printable {
    @Override
    public void print(String str) {
        System.out.println(str);
    }
}

class MultiPrinter extends SimplePrinter2 {
    @Override
    public void print(String str) {
        super.print("start of multi...");
        super.print(str);
        super.print("end of multi");
    }
}

class InstanceofInterface {
    public static void main(String[] args) {
        Printable prn1 = new SimplePrinter2();
        Printable prn2 = new MultiPrinter();

        if (prn1 instanceof Printable)
            prn1.print("This is a simple printer.");
        System.out.println();

        if (prn2 instanceof Printable)
            prn2.print("This is a multiful printer.");

    }
}
