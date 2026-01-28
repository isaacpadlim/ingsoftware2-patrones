interface Transporte { void entregar(); }

class Camion implements Transporte {
    public void entregar() { System.out.println("Entrega por tierra"); }
}

abstract class Logistica {
    abstract Transporte crearTransporte();
    public void planear() {
        Transporte t = crearTransporte();
        t.entregar();
    }
}

class LogisticaTerrestre extends Logistica {
    Transporte crearTransporte() { return new Camion(); }
}