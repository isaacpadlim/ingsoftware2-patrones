interface Device {
    boolean isOn();
    void powerOn();
    void powerOff();
}

class TV implements Device {
    private boolean on = false;

    @Override
    public boolean isOn() { return on; }

    @Override
    public void powerOn() {
        on = true;
        System.out.println("TV: ON");
    }

    @Override
    public void powerOff() {
        on = false;
        System.out.println("TV: OFF");
    }
}

class Radio implements Device {
    private boolean on = false;

    @Override
    public boolean isOn() { return on; }

    @Override
    public void powerOn() {
        on = true;
        System.out.println("Radio: ON");
    }

    @Override
    public void powerOff() {
        on = false;
        System.out.println("Radio: OFF");
    }
}

// Abstraction: se conecta a Device (bridge)
class RemoteControl {
    protected final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isOn()) device.powerOff();
        else device.powerOn();
    }
}

public class BridgeExample {
    public static void main(String[] args) {
        RemoteControl remoteTV = new RemoteControl(new TV());
        remoteTV.togglePower();
        remoteTV.togglePower();

        RemoteControl remoteRadio = new RemoteControl(new Radio());
        remoteRadio.togglePower();
    }
}
