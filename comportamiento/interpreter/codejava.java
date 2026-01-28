package comportamiento.interpreter;

interface Expression {
    int interpret();
}

class Number implements Expression {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    public int interpret() {
        return value;
    }
}

class Add implements Expression {
    private Expression left, right;

    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
