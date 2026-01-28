## Prototype

* **Categoría:** Creacional
* **Propósito:** Crear nuevos objetos copiando una instancia prototípica existente.

### Código de Referencia

* [Python](./ejemplo.py)
* [Java](./ejemplo.java)

### Estructura UML

```text
+-------------------+       +-------------------+
|     Prototype     | <---- |      Client       |
+-------------------+       +-------------------+
| + clonar()        |       |                   |
+-------------------+       +-------------------+
        ^
        |
+-------------------+
| ConcretePrototype |
+-------------------+
| + clonar()        |
+-------------------+