class SillaModerna:
    def sentarse(self): print("Silla Moderna")

class FabricaMuebles: 
    def crear_silla(self): pass

class FabricaModerna(FabricaMuebles):
    def crear_silla(self): return SillaModerna()