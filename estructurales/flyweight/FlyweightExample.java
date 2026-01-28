import java.util.HashMap;
import java.util.Map;

class CharacterStyle {
    // Flyweight: estado intrínseco (compartido)
    private final String font;
    private final int size;
    private final boolean bold;

    public CharacterStyle(String font, int size, boolean bold) {
        this.font = font;
        this.size = size;
        this.bold = bold;
    }

    // char, x, y = estado extrínseco (no compartido)
    public void render(char c, int x, int y) {
        System.out.println("Render '" + c + "' at (" + x + "," + y + ") with "
                + font + "/" + size + "/bold=" + bold);
    }
}

class StyleFactory {
    private final Map<String, CharacterStyle> cache = new HashMap<>();

    public CharacterStyle getStyle(String font, int size, boolean bold) {
        String key = font + "|" + size + "|" + bold;
        return cache.computeIfAbsent(key, k -> new CharacterStyle(font, size, bold));
    }
}

public class FlyweightExample {
    public static void main(String[] args) {
        StyleFactory factory = new StyleFactory();

        CharacterStyle s1 = factory.getStyle("Arial", 12, false);
        CharacterStyle s2 = factory.getStyle("Arial", 12, false);

        System.out.println("Same shared object? " + (s1 == s2));

        s1.render('H', 0, 0);
        s2.render('i', 1, 0);
    }
}