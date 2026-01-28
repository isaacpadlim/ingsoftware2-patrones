class Notifier:
    def send(self, message: str) -> None:
        raise NotImplementedError


class BasicNotifier(Notifier):
    def send(self, message: str) -> None:
        print(f"Email: {message}")


class NotifierDecorator(Notifier):
    def __init__(self, wrappee: Notifier) -> None:
        self.wrappee = wrappee

    def send(self, message: str) -> None:
        self.wrappee.send(message)


class SMSDecorator(NotifierDecorator):
    def send(self, message: str) -> None:
        super().send(message)
        print(f"SMS: {message}")


class WhatsAppDecorator(NotifierDecorator):
    def send(self, message: str) -> None:
        super().send(message)
        print(f"WhatsApp: {message}")


if __name__ == "__main__":
    notifier = WhatsAppDecorator(SMSDecorator(BasicNotifier()))
    notifier.send("Pedido confirmado")