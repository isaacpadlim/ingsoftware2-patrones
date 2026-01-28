interface Mediator { void notify(Object sender, String event); }
class Component {
    protected Mediator m;
    public Component(Mediator m) { this.m = m; }
}
class Button extends Component {
    public Button(Mediator m) { super(m); }
    public void click() { m.notify(this, "click"); }
}