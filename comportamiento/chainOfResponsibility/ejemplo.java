abstract class Manejador {
    protected Manejador sig;
    public void setSig(Manejador m) { this.sig = m; }
    public abstract void manejar(String req);
}
class Soporte extends Manejador {
    public void manejar(String req) {
        if(req.equals("simple")) System.out.println("Resuelto");
        else if(sig != null) sig.manejar(req);
    }
}