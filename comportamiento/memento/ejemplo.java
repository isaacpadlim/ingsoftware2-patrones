class Memento {
    private String s;
    public Memento(String s) { this.s = s; }
    public String getState() { return s; }
}
class Originator {
    String state;
    public Memento save() { return new Memento(state); }
    public void restore(Memento m) { state = m.getState(); }
}