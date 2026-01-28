# Facade

- **Nombre:** Facade  
- **Categoría:** Estructural  
- **Propósito:** Proveer una interfaz simple y unificada para usar un subsistema complejo.

---

## Código de Referencia

- [Python](./FacadeExample.py)
- [Java](./FacadeExample.java)

---

## Estructura UML

+-------------------------+
| ComputerFacade |
+-------------------------+
| - cpu : CPU |
| - memory : Memory |
| - disk : Disk |
+-------------------------+
| + start() |
+-------------------------+
+-------------+ +-------------+ +-------------+
| CPU | | Memory | | Disk |
+-------------+ +-------------+ +-------------+
| | | | | |
+-------------+ +-------------+ +-------------+
| + freeze() | | + load() | | + read() |
| + jump() | | | | |
| + execute() | | | | |
+-------------+ +-------------+ +-------------+