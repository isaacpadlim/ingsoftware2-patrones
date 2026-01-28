package comportamiento.state;

interface State {
    void handle();
}

class On implements State {
    public void handle() {
        System.out.println("Encendido");
    }
}

class Off implements State {
    public void handle() {
        System.out.println("Apagado");
    }
}
