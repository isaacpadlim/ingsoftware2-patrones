interface Printer {
    void print(String message);
}

// Clase existente con una interfaz distinta a la esperada
class LegacyPrinter {
    public void printText(String text) {
        System.out.println("LegacyPrinter: " + text);
    }
}

// Adapter: implementa la interfaz esperada y delega al LegacyPrinter
class PrinterAdapter implements Printer {
    private final LegacyPrinter legacy;

    public PrinterAdapter(LegacyPrinter legacy) {
        this.legacy = legacy;
    }

    @Override
    public void print(String message) {
        legacy.printText(message);
    }
}

public class AdapterExample {
    public static void main(String[] args) {
        LegacyPrinter legacy = new LegacyPrinter();
        Printer printer = new PrinterAdapter(legacy);

        printer.print("Hola desde Adapter (Java)");
    }
}
