package comportamiento.observer;

import java.util.List;
import java.util.ArrayList;

public class codjava {
    
}
interface Observer {
    void update(String message);
}

class User implements Observer {
    public void update(String message) {
        System.out.println("Notificación: " + message);
    }
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(String msg) {
        for (Observer o : observers) {
            o.update(msg);
        }
    }
}
