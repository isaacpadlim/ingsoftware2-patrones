# Template Method

## Categoría
Comportamiento

## Propósito
Definir el esqueleto de un algoritmo en una clase base y permitir que las subclases redefinan ciertos pasos.

## Código de Referencia

- [Implementación en Python](./codpython.py)
- [Implementación en Java](./codjava.java)

```text
+-----------+
|  Game     |
+-----------+
| play()    |
| start()   |
| end()     |
+-----------+
      ▲
      |
+-------------+
|  Football   |
+-------------+
| start()     |
| end()       |
+-------------+
