class CharacterStyle:
    """
    Flyweight: estado intrínseco (compartido)
    """
    def __init__(self, font: str, size: int, bold: bool) -> None:
        self.font = font
        self.size = size
        self.bold = bold

    def render(self, char: str, x: int, y: int) -> None:
        # char, x, y = estado extrínseco (no compartido)
        print(f"Render '{char}' at ({x},{y}) with {self.font}/{self.size}/bold={self.bold}")


class StyleFactory:
    def __init__(self) -> None:
        self._cache = {}

    def get_style(self, font: str, size: int, bold: bool) -> CharacterStyle:
        key = (font, size, bold)
        if key not in self._cache:
            self._cache[key] = CharacterStyle(font, size, bold)
        return self._cache[key]


if __name__ == "__main__":
    factory = StyleFactory()

    # Mismo estilo -> mismo objeto compartido (flyweight)
    style1 = factory.get_style("Arial", 12, False)
    style2 = factory.get_style("Arial", 12, False)

    print("Same shared object?", style1 is style2)

    # Estado extrínseco cambia (char y posición)
    style1.render("H", 0, 0)
    style2.render("i", 1, 0)