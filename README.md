# ingsoftware2-patrones

### Patrones de Diseño
Cada patrón incluye:
- Propósito técnico
- Ejemplo funcional en **Python** y **Java**
- Diagrama UML de clases en formato textual

### Catálogo de Patrones Estructurales

- [Facade](./estructurales/facade/README.md)  
  Provee una interfaz unificada y simple para acceder a subsistemas complejos.

- [Adapter](./estructurales/adapter/README.md)  
  Permite que clases con interfaces incompatibles trabajen juntas.

- [Bridge](./estructurales/bridge/README.md)  
  Separa la abstracción de su implementación para que ambas evolucionen independientemente.

- [Composite](./estructurales/composite/README.md)  
  Permite tratar objetos individuales y composiciones de objetos de forma uniforme.

- [Decorator](./estructurales/decorator/README.md)  
  Añade responsabilidades a un objeto dinámicamente sin modificar su estructura base.

- [Flyweight](./estructurales/flyweight/README.md)  
  Reduce el consumo de memoria compartiendo objetos comunes entre múltiples instancias.

- [Proxy](./estructurales/proxy/README.md)  
  Proporciona un sustituto que controla el acceso a un objeto real.

### Catálogo de Patrones Creacionales

- [Abstract Factory](./creacionales/abstractFactory/README.md)  
  Crear familias de objetos relacionados sin especificar sus clases concretas.

- [Builder](./creacionales/builder/README.md)  
  Separar la construcción de un objeto complejo de su representación paso a paso.

- [Factory Method](./creacionales/factoryMethod/README.md)  
  Define una interfaz para crear objetos, pero permite a las subclases decidir qué clase instanciar.

- [Prototype](./creacionales/prototype/README.md)  
  Crear nuevos objetos copiando una instancia prototípica existente.

- [Singleton](./creacionales/singleton/README.md)  
  Garantizar que una clase tenga una única instancia y proveer un punto de acceso global.

### Catálogo de Patrones de Comportamiento

- [Chain of Responsibility](./comportamiento/chainOfResponsibility/README.md)  
  Permite pasar una solicitud a lo largo de una cadena de manejadores hasta que uno la procese.

- [Command](./comportamiento/command/README.md)  
  Encapsula una solicitud como un objeto, permitiendo parametrizar clientes con diferentes solicitudes.

- [Interpreter](./comportamiento/interpreter/README.md)  
  Define una gramática y un intérprete para evaluar expresiones del lenguaje.

- [Iterator](./comportamiento/iterator/README.md)  
  Permite recorrer una colección sin exponer su estructura interna.

- [Mediator](./comportamiento/mediator/README.md)  
  Centraliza la comunicación entre objetos para reducir el acoplamiento directo.

- [Memento](./comportamiento/memento/README.md)  
  Captura y restaura el estado interno de un objeto sin violar el encapsulamiento.

- [Observer](./comportamiento/observer/README.md)  
  Define una dependencia uno-a-muchos para notificar cambios de estado.

- [State](./comportamiento/state/README.md)  
  Permite que un objeto altere su comportamiento cuando cambia su estado interno.

- [Strategy](./comportamiento/strategy/README.md)  
  Define una familia de algoritmos intercambiables en tiempo de ejecución.

- [Template Method](./comportamiento/templateMethod/README.md)  
  Define el esqueleto de un algoritmo dejando pasos específicos a las subclases.

- [Visitor](./comportamiento/visitor/README.md)  
  Permite definir nuevas operaciones sobre una estructura de objetos sin modificarla.
