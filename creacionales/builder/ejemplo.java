class Auto { String motor; }
class AutoBuilder {
    private Auto auto = new Auto();
    public void buildMotor() { auto.motor = "V8"; }
    public Auto getResult() { return auto; }
}