# Bridge

- **Nombre:** Bridge  
- **Categoría:** Estructural  
- **Propósito:** Separar la abstracción de la implementación para que ambas puedan variar independientemente.

---

## Código de Referencia
- [Python](./BridgeExample.py)
- [Java](./BridgeExample.java)

---

## Estructura UML

```text
+------------------------+                 +------------------------+
|     RemoteControl      |  has (bridge)   |         Device         |
+------------------------+---------------->|  <<interface>>         |
| - device : Device      |                 +------------------------+
+------------------------+                 | + isOn() : boolean     |
| + togglePower()        |                 | + powerOn()            |
+------------------------+                 | + powerOff()           |
                                           +------------------------+
                                                   ^          ^
                                                   |          |
                                     +-------------------+  +-------------------+
                                     |        TV         |  |       Radio       |
                                     +-------------------+  +-------------------+
                                     | - on : boolean    |  | - on : boolean    |
                                     +-------------------+  +-------------------+
                                     | + isOn()          |  | + isOn()          |
                                     | + powerOn()       |  | + powerOn()       |
                                     | + powerOff()      |  | + powerOff()      |
                                     +-------------------+  +-------------------+
