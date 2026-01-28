## Factory Method

* **Categoría:** Creacional
* **Propósito:** Define una interfaz para crear objetos, pero permite a las subclases decidir qué clase instanciar.

### Código de Referencia

* [Python](./ejemplo.py.py)
* [Java](./ejemplo.java)

### Estructura UML

```text
+--------------+            +-----------------+
|   Creator    |            |     Product     |
+--------------+            +-----------------+
| + factory()  |            | + operacion()   |
+--------------+            +-----------------+
       ^                             ^
       |                             |
+-----------------+        +------------------+
| ConcreteCreator | -----> | ConcreteProduct  |
+-----------------+        +------------------+
| + factory()     |        | + operacion()    |
+-----------------+        +------------------+