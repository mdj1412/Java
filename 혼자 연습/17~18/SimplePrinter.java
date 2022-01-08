interface Printable3 {
    static void printLine(String str) {                             // XXX public static method
        System.out.println(str);
    }
    default void print(String doc) {
        System.out.println(doc);
    }
}

class Printer2 implements Printable3 { }

class SimplePrinter {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";
        Printable3 prn = new Printer2();
        prn.print(myDoc);

        Printable3.printLine("end of line");
    }
}
