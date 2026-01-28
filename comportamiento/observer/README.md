# Observer

## Categoría
Comportamiento

## Propósito
Definir una dependencia uno-a-muchos para que cuando un objeto cambie de estado, todos sus observadores sean notificados.

## Código de Referencia

- [Python](./codpython.py)
- [Java](./codjava.java)

```text
+------------+
| Observer   |
+------------+
| + update() |
+------------+
      ▲
      |
+--------+
| User   |
+--------+

+------------+
| Subject    |
+------------+
| observers  |
+------------+
| attach()   |
| notify()   |
+------------+
