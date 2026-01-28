package comportamiento.visitor;

public class codjava {
}

interface Visitor {
    void visit(Book book);
}

interface Element {
    void accept(Visitor visitor);
}

class Book implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class PriceVisitor implements Visitor {
    public void visit(Book book) {
        System.out.println("Calculando precio del libro");
    }
}
  

