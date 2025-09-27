public class Main {
    public static void main(String[] args) {
        // Using modern printer directly
        Printer modern = new ModernPrinter();
        modern.printText("Hello from Modern Printer!");

        // Using legacy printer through adapter
        LegacyPrinter oldPrinter = new LegacyPrinter();
        Printer adapter = new PrinterAdapter(oldPrinter);
        adapter.printText("Hello from Legacy Printer via Adapter!");
    }
}
