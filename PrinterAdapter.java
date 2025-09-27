// Adapter makes LegacyPrinter compatible with Printer interface
public class PrinterAdapter implements Printer {
    private final LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void printText(String text) {
        legacyPrinter.printLegacy(text);
    }
}
