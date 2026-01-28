# Adapter

- **Nombre:** Adapter  
- **Categoría:** Estructural  
- **Propósito:** Convertir la interfaz de una clase en otra que el cliente espera sin modificar la clase original.

---

## Código de Referencia
- [Python](./AdapterExample.py)
- [Java](./AdapterExample.java)

---

## Estructura UML

```text
+------------------+          adapts to          +----------------------+
|     Printer      |<--------------------------|    PrinterAdapter     |
+------------------+                           +----------------------+
|                  |                           | - legacy : Legacy... |
+------------------+                           +----------------------+
| + print(msg)     |                           | + print(msg)         |
+------------------+                           +----------------------+
                                                        |
                                                        | uses
                                                        v
                                             +----------------------+
                                             |    LegacyPrinter     |
                                             +----------------------+
                                             |                      |
                                             +----------------------+
                                             | + print_text(text)   |
                                             +----------------------+
