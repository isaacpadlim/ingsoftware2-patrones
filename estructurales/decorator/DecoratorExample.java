interface Notifier {
    void send(String message);
}

class BasicNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

abstract class NotifierDecorator implements Notifier {
    protected final Notifier wrappee;

    protected NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}

class SMSDecorator extends NotifierDecorator {
    public SMSDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SMS: " + message);
    }
}

class WhatsAppDecorator extends NotifierDecorator {
    public WhatsAppDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("WhatsApp: " + message);
    }
}

public class DecoratorExample {
    public static void main(String[] args) {
        Notifier notifier =
            new WhatsAppDecorator(
                new SMSDecorator(
                    new BasicNotifier()
                )
            );

        notifier.send("Pedido confirmado");
    }
}
