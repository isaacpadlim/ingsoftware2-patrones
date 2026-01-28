# Decorator

- **Nombre:** Decorator  
- **Categoría:** Estructural  
- **Propósito:** Añadir responsabilidades a un objeto de forma dinámica sin modificar su clase.

---

## Código de Referencia
- [Python](./DecoratorExample.py)
- [Java](./DecoratorExample.java)

---

## Estructura UML

```text
+----------------------------+
|          Notifier          |
+----------------------------+
|                            |
+----------------------------+
| + send(message : String)   |
+----------------------------+
              ^
              |
     +--------------------+
     |   BasicNotifier    |
     +--------------------+
     |                    |
     +--------------------+
     | + send(message)    |
     +--------------------+

              ^
              |
     +----------------------------+
     |     NotifierDecorator      |
     +----------------------------+
     | - wrappee : Notifier       |
     +----------------------------+
     | + send(message)            |
     +----------------------------+
              ^
              |
     +--------------------+     +-----------------------+
     |   SMSDecorator     |     |   WhatsAppDecorator   |
     +--------------------+     +-----------------------+
     |                    |     |                       |
     +--------------------+     +-----------------------+
     | + send(message)    |     | + send(message)       |
     +--------------------+     +-----------------------+
