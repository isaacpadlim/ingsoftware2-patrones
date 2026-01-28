# Command

## Categoría
Comportamiento

## Propósito
Encapsular una solicitud como un objeto, permitiendo parametrizar clientes con diferentes solicitudes y soportar operaciones deshacer/rehacer.

## Código de Referencia

- [Implementación en Python](./codepython.py)
- [Implementación en Java](./jcodjava.java)

```text
+---------------+
|   Command     |
+---------------+
| + execute()   |
+---------------+
        ▲
        |
+----------------------+
| LightOnCommand       |
+----------------------+
| - light : Light      |
+----------------------+
| + execute()          |
+----------------------+

+-------------+
|   Light     |
+-------------+
| + turnOn()  |
+-------------+

+----------------+
| RemoteControl  |
+----------------+
| - command      |
+----------------+
| + pressButton()|
+----------------+
