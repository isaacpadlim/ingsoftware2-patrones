class Auto:
    def __init__(self): self.motor = None

class AutoBuilder:
    def __init__(self): self.auto = Auto()
    def build_motor(self): self.auto.motor = "V8"
    def get_result(self): return self.auto