class State:
    def handle(self):
        pass

class On(State):
    def handle(self):
        print("Encendido")

class Off(State):
    def handle(self):
        print("Apagado")

class Switch:
    def __init__(self):
        self.state = Off()

    def press(self):
        self.state.handle()