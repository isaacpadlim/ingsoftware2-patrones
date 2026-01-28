## Memento

* **Categoría:** Comportamiento
* **Propósito:** Capturar y restaurar el estado interno de un objeto sin violar la encapsulación.

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