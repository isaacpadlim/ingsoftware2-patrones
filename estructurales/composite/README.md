# Composite

- **Nombre:** Composite  
- **Categoría:** Estructural  
- **Propósito:** Permitir tratar objetos individuales y composiciones de objetos de forma uniforme (estructura en árbol).

---

## Código de Referencia
- [Python](./CompositeExample.py)
- [Java](./CompositeExample.java)

---

## Estructura UML

```text
+--------------------------+
|        Component         |
+--------------------------+
|                          |
+--------------------------+
| + operation() : String   |
+--------------------------+
           ^
           |
   +------------------+           +----------------------------------+
   |       Leaf       |           |            Composite              |
   +------------------+           +----------------------------------+
   | - name : String  |           | - name : String                   |
   +------------------+           | - children : List<Component>      |
   | + operation()    |           +----------------------------------+
   +------------------+           | + add(c : Component)              |
                                  | + operation() : String            |
                                  +----------------------------------+
                                            |
                                            | contains (0..*)
                                            v
                                  +--------------------------+
                                  |        Component         |
                                  +--------------------------+
