interface Silla { void sentarse(); }
class SillaModerna implements Silla {
    public void sentarse() { System.out.println("Silla Moderna"); }
}
interface FabricaMuebles { Silla crearSilla(); }
class FabricaModerna implements FabricaMuebles {
    public Silla crearSilla() { return new SillaModerna(); }
}