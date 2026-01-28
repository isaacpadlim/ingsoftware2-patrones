# Proxy

- **Nombre:** Proxy  
- **Categoría:** Estructural  
- **Propósito:** Proveer un sustituto que controle el acceso a un objeto real (ej. lazy load, permisos, caché).

---

## Código de Referencia
- [Python](./ProxyExample.py)
- [Java](./ProxyExample.java)

---

## Estructura UML

```text
+---------------------------+
|           Image           |
+---------------------------+
|                           |
+---------------------------+
| + display()               |
+---------------------------+
          ^
          |
  +--------------------+            +--------------------+
  |     RealImage      |            |     ImageProxy     |
  +--------------------+            +--------------------+
  | - filename : Str   |            | - filename : Str   |
  +--------------------+            | - real : RealImage |
  | + display()        |            +--------------------+
  | - loadFromDisk()   |            | + display()        |
  +--------------------+            +--------------------+
                 ^                          |
                 |                          | creates on demand (lazy)
                 +--------------------------+