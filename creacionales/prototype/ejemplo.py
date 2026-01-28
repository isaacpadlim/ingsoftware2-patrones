import copy
class Circulo:
    def __init__(self, radio): self.radio = radio
    def clonar(self): return copy.deepcopy(self)