
import java.util.ArrayList;
import java.util.List;

interface Component {
    String operation();
}

class Leaf implements Component {
    private final String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public String operation() {
        return name;
    }
}

class Composite implements Component {
    private final String name;
    private final List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    @Override
    public String operation() {
        List<String> parts = new ArrayList<>();
        for (Component c : children) {
            parts.add(c.operation());
        }
        return name + "(" + String.join(", ", parts) + ")";
    }
}

public class CompositeExample {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("A"));

        Composite branch = new Composite("branch");
        branch.add(new Leaf("B"));
        branch.add(new Leaf("C"));

        root.add(branch);

        System.out.println(root.operation()); // root(A, branch(B, C))
    }
}
