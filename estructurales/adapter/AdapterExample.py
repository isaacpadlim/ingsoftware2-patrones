class LegacyPrinter:
    # Clase existente con una interfaz "vieja"
    def print_text(self, text: str) -> None:
        print(f"LegacyPrinter: {text}")


class Printer:
    # Interfaz esperada por el cliente
    def print(self, message: str) -> None:
        raise NotImplementedError


class PrinterAdapter(Printer):
    # Adapter: hace que LegacyPrinter funcione como Printer
    def __init__(self, legacy_printer: LegacyPrinter) -> None:
        self.legacy = legacy_printer

    def print(self, message: str) -> None:
        self.legacy.print_text(message)


if __name__ == "__main__":
    legacy = LegacyPrinter()
    printer: Printer = PrinterAdapter(legacy)

    printer.print("Hola desde Adapter (Python)")