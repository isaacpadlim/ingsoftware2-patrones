## Chain of Responsibility

* **Categoría:** Comportamiento
* **Propósito:** Pasar solicitudes a lo largo de una cadena de manejadores.

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