// https://www.geeksforgeeks.org/adapter-pattern/?ref=lbp

interface Printer{
    void print();
}

class LegacyPrinter {
    void printDocument(){
        System.out.println("This is a legacy printer");
    }
}

class PrinterAdapter implements Printer {
    LegacyPrinter legacyPrinter;
    PrinterAdapter(){
        this.legacyPrinter = new LegacyPrinter();
    }
    @Override
    void print() {
        this.legacyPrinter.printDocument();
    }
}

class Main{
    public static void main(String[] args) {
        Printer p = new PrinterAdapter();
        p.print();
    }
}