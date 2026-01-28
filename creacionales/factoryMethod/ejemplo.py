from abc import ABC, abstractmethod

class Transporte(ABC):
    @abstractmethod
    def entregar(self): pass

class Camion(Transporte):
    def entregar(self): print("Entrega por tierra")

class Logistica(ABC):
    @abstractmethod
    def crear_transporte(self): pass

    def planear(self):
        t = self.crear_transporte()
        t.entregar()

class LogisticaTerrestre(Logistica):
    def crear_transporte(self): return Camion()