interface Image {
    void display();
}

class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename + " from disk...");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}

class ImageProxy implements Image {
    private final String filename;
    private RealImage real; // se crea solo cuando se usa

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (real == null) {
            real = new RealImage(filename); // lazy load
        }
        real.display();
    }
}

public class ProxyExample {
    public static void main(String[] args) {
        Image img = new ImageProxy("photo.png");
        img.display();
        img.display();
    }
}
