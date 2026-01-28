# Interpreter

## Categoría
Comportamiento

## Propósito
Definir una gramática y un intérprete para evaluar expresiones del lenguaje.

## Código de Referencia

- [Python](./codepython.py)
- [Java](./codejava.javajava)

```text
+----------------+
| Expression     |
+----------------+
| + interpret()  |
+----------------+
        ▲
        |
+---------+    +--------+
| Number  |    |  Add   |
+---------+    +--------+
| value   |    | left   |
+---------+    | right  |
               +--------+
