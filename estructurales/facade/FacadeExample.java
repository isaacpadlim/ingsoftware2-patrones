class CPU {
    public void freeze() { System.out.println("CPU: freeze"); }
    public void jump(int position) { System.out.println("CPU: jump to " + position); }
    public void execute() { System.out.println("CPU: execute"); }
}

class Memory {
    public void load(int position, String data) {
        System.out.println("Memory: load '" + data + "' at " + position);
    }
}

class Disk {
    public String read(int sector, int size) {
        return "DATA(sector=" + sector + ", size=" + size + ")";
    }
}

class ComputerFacade {
    private final CPU cpu = new CPU();
    private final Memory memory = new Memory();
    private final Disk disk = new Disk();

    public void start() {
        cpu.freeze();
        String data = disk.read(10, 128);
        memory.load(0, data);
        cpu.jump(0);
        cpu.execute();
    }
}

public class FacadeExample {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
