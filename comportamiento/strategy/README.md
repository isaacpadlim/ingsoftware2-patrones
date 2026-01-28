# Strategy

## Categoría
Comportamiento

## Propósito
Definir una familia de algoritmos, encapsular cada uno y hacerlos intercambiables sin modificar el código del cliente.

## Código de Referencia

- [Implementación en Python](./codpython.py)
- [Implementación en Java](./codjava.java)

```text
+------------+
| Strategy   |
+------------+
| + execute()|
+------------+
       ▲
       |
+-------------------+
| AddStrategy       |
+-------------------+
| execute()         |
+-------------------+

+-------------------+
| SubtractStrategy  |
+-------------------+
| execute()         |
+-------------------+

+--------------+
| Calculator   |
+--------------+
| - strategy   |
+--------------+
| calculate()  |
+--------------+
