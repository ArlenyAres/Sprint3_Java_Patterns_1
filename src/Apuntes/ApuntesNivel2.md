# Abstract Factory Pattern
El patrón Abstract Factory es un patrón de diseño creacional que proporciona una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas. Este patrón es útil cuando se necesita crear un grupo de objetos que comparten una interfaz común, pero las implementaciones pueden variar.

## Componentes del Abstract Factory
### AbstractFactory: 
Declara una interfaz para operaciones que crean productos abstractos.
### ConcreteFactory: 
Implementa las operaciones para crear objetos concretos.
### AbstractProduct: 
Declara una interfaz para un tipo de producto.
### ConcreteProduct: 
Define un objeto que se creará.
### Client: 
Usa solo las interfaces declaradas por AbstractFactory y AbstractProduct

https://refactoring.guru/es/design-patterns/abstract-factory
-------------------------------------------------

#### AbstractProduct: 
Address y PhoneNumber declaran interfaces para direcciones 
y números de teléfono.
#### ConcreteProduct: 
USAddress, USAPhoneNumber, SPAAddress y SPAAPhoneNumber 
implementan estas interfaces para diferentes países.
#### AbstractFactory: 
ContactFactory declara métodos para crear productos abstractos.
#### ConcreteFactory: 
USContactFactory y SPAContactFactory 
implementan estos métodos para crear productos concretos.
#### Client: 
Usa una fábrica para crear direcciones 
y números de teléfono sin conocer sus clases concretas.