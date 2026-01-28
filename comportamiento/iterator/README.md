# Iterator

## Categoría
Comportamiento

## Propósito
Proporcionar una forma de acceder secuencialmente a los elementos de una colección sin exponer su representación interna.

## Código de Referencia

- [Python](./codpython.py)
- [Java](./codjava.java)


```text
+---------------+
|  Iterator     |
+---------------+
| + hasNext()   |
| + next()      |
+---------------+
        ▲
        |
+------------------+
| NumberIterator   |
+------------------+
| - index          |
| - collection     |
+------------------+
