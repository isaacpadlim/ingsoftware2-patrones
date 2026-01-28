public abstract class Game {
    public final void play() {
        start();
        end();
    }

    protected abstract void start();
    protected abstract void end();
}

class Football extends Game {
    protected void start() {
        System.out.println("Inicia el partido de fútbol");
    }

    protected void end() {
        System.out.println("Finaliza el partido");
    }
}
{
    
}
