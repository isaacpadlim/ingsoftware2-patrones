class Observer:
    def update(self, message):
        pass

class User(Observer):
    def update(self, message):
        print("Notificación:", message)

class Subject:
    def __init__(self):
        self.observers = []

    def attach(self, observer):
        self.observers.append(observer)

    def notify(self, message):
        for o in self.observers:
            o.update(message)

subject = Subject()
user = User()
subject.attach(user)
subject.notify("Nuevo evento")