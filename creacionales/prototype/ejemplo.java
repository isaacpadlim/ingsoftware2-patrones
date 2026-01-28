interface Prototype { Prototype clonar(); }
class Circulo implements Prototype {
    int radio;
    public Circulo(int r) { this.radio = r; }
    public Prototype clonar() { return new Circulo(this.radio); }
}