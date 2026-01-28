## Builder

* **Categoría:** Creacional
* **Propósito:** Separar la construcción de un objeto complejo de su representación paso a paso.

### Código de Referencia

* [Python](./ejemplo.py)
* [Java](./ejemplo.java)

### Estructura UML

```text
+------------+      +------------+      +---------+
|  Director  | ---> |  Builder   | ---> | Product |
+------------+      +------------+      +---------+
| + build()  |      | + buildA() |      |         |
+------------+      +------------+      +---------+
                          ^
                          |
                    +-----------------+
                    | ConcreteBuilder |
                    +-----------------+
                    | + buildA()      |
                    | + getResult()   |
                    +-----------------+