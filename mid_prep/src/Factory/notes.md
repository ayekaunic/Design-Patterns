# Factory Pattern
Used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.

Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.

The Factory Method separates product construction code from the code that actually uses the product. Therefore it’s easier to extend the product construction code independently from the rest of the code.

Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.

Use the Factory Method when you want to save system resources by reusing existing objects instead of rebuilding them each time.

## Pros
- Factory design pattern provides approach to code for interface rather than implementation.
- Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more robust, less coupled and easy to extend. You avoid tight coupling between the creator and the concrete products.
- Factory pattern provides abstraction between implementation and client classes through inheritance.
- Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.

## Cons
-  The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.