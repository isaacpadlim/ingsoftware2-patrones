## Factory Method

* **Categoría:** Creacional
* **Propósito:** Crear familias de objetos relacionados sin especificar sus clases concretas.

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