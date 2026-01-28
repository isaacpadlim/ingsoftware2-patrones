class Mediator:
    def notify(self, sender, event): pass

class Component:
    def __init__(self, m): self.mediator = m

class Button(Component):
    def click(self): self.mediator.notify(self, "click")