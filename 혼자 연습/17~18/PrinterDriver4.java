interface Printable2 {
    void print(String doc);
    default void printCMYK(String doc) { }                  // XXX public method
}

class Prn731Drv implements Printable2 {
    @Override
    public void print(String doc) {
        System.out.println("Rome MD-731 printer");
        System.out.println(doc);
    }
}

class PrinterDriver4 {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";
        Printable2 prn1 = new Prn731Drv();
        prn1.print(myDoc);
        prn1.printCMYK(myDoc);
        System.out.println();

        Printable2 prn2 = new Prn909Drv();
        prn2.print(myDoc);
    }
}
