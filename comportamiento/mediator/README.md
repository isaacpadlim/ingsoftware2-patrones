## Mediator

* **Categoría:** Comportamiento
* **Propósito:** Reducir dependencias caóticas entre objetos haciéndolos comunicar a través de un objeto mediador.

### Código de Referencia

* [Python](./ejemplo.py)
* [Java](./ejemplo.java)

### Estructura UML

```text
+------------------+          +------------------+
| AbstractFactory  |          | AbstractProduct  |
+------------------+          +------------------+
| + crearProdA()   |          | + operacion()    |
+------------------+          +------------------+
        ^                              ^
        |                              |
+------------------+          +------------------+
| ConcreteFactory  | -------> | ConcreteProduct  |
+------------------+          +------------------+
| + crearProdA()   |          | + operacion()    |
+------------------+          +------------------+