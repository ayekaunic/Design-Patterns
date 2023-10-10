# Singleton Pattern
- Restricts the instantiation of a class & ensures that only one instance of the class exists.
- Singleton class must provide a global access point to get the instance of the class.
- Used for logging, drivers objects, caching and thread pool.
- Also used in other patterns (for e.g. Builder, Abstract Factory, Prototype etc.)

## Implementation
There are different approaches, but all of them have the following common concepts:
- Private constructor to restrict instantiation of class from any other classes.
- Private static variable of the same class that is the only instance of the class.
- Public static method that returns the instance of the class, this is the global access point for the outer world to get the instance of the singleton class.

## Eager Initialization
The instance of the singleton class is created at the time of class loading. The drawback to eager initialization is that the method is created even though the client application might not be using it.
If your singleton class is not using a lot of resources, this is the approach to use. But in most of the scenarios, singleton classes are created for resources such as File System, Database connections, etc.
This method doesn’t provide any options for exception handling.

## Static Block Initialization
Similar to eager initialization, except that instance of the class is created in the static block that provides the option for exception handling.
Both eager initialization and static block initialization create the instance even before it’s being used and that is not the best practice to use.

## Lazy Initialization
Lazy initialization method to implement the singleton pattern creates the instance in the global access method.
Works fine in the case of the single-threaded environment, but when it comes to multi-threaded systems, it can cause issues if multiple threads are inside the if condition at the same time. It will destroy the singleton pattern and both threads will get different instances of the singleton class.

## Thread Safe Singleton
A simple way to create a thread-safe singleton class is to make the global access method synchronized so that only one thread can execute this method at a time. Works fine and provides thread-safety, but it reduces the performance because of the cost associated with the synchronized method.
To avoid this extra overhead every time, double-checked locking principle is used. In this approach, the synchronized block is used inside the if condition with an additional check to ensure that only one instance of a singleton class is created.