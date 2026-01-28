class Manejador:
    siguiente = None
    def set_next(self, m): self.siguiente = m
    def manejar(self, req):
        if self.siguiente: self.siguiente.manejar(req)

class Soporte(Manejador):
    def manejar(self, req):
        if req == "simple": print("Resuelto")
        else: super().manejar(req)