# Visitor

## Categoría
Comportamiento

## Propósito
Separar algoritmos de la estructura de objetos sobre los que operan, permitiendo agregar nuevas operaciones sin modificar las clases existentes.

## Código de Referencia

- [Implementación en Python](./codpython.py)
- [Implementación en Java](./codjava.java)

```text
+----------+
| Visitor  |
+----------+
| visit()  |
+----------+
     ▲
     |
+----------------+
| PriceVisitor   |
+----------------+

+----------+
| Element  |
+----------+
| accept() |
+----------+
     ▲
     |
+-------+
| Book  |
+-------+
