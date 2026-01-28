 # Flyweight

- **Nombre:** Flyweight  
- **Categoría:** Estructural  
- **Propósito:** Compartir objetos para reducir el uso de memoria cuando existen muchas instancias similares.

---

## Código de Referencia
- [Python](./FlyweightExample.py)
- [Java](./FlyweightExample.java)

---

## Estructura UML

```text
+------------------------------+
|           Flyweight          |
+------------------------------+
| - font : String              |
| - size : int                 |
| - bold : boolean             |
+------------------------------+
| + render(char, x, y)         |
+------------------------------+

+--------------------------------------+
|           FlyweightFactory           |
+--------------------------------------+
| - cache : Map<Key, Flyweight>        |
+--------------------------------------+
| + getFlyweight(font, size, bold)     |
+--------------------------------------+
                |
                | returns shared Flyweight
                v
+------------------------------+
|           Flyweight          |
+------------------------------+
