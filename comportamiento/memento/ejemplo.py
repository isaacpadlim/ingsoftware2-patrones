class Memento:
    def __init__(self, state): self._state = state
    def get_state(self): return self._state

class Originator:
    state = ""
    def save(self): return Memento(self.state)
    def restore(self, m): self.state = m.get_state()