# CS5004-Design-Patterns-Presentation

## Introduction to Factory Method Pattern:

The Factory Method pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. In other words, the Factory Method pattern promotes the use of object composition over inheritance and allows the instantiation process to be deferred to subclasses.

### Description:

The Factory Method pattern consists of the following components:

1. Creator: An abstract class or interface that declares the factory method, which returns an object of the Product type. The Creator may also contain implementations of the factory method with default behavior. The factory method is typically abstract or virtual, which means that the subclasses must override it to provide the actual object creation logic.

2. Concrete Creator: A class that inherits from the Creator and implements the factory method to create and return an instance of the Concrete Product.

3. Product: An abstract class or interface that defines the interface for the objects that the factory method creates.

4. Concrete Product: A class that implements the Product interface and provides a specific implementation of the product. The Concrete Product is created by the Concrete Creator through the factory method.

### When to use the Factory Method Pattern:

The Factory Method pattern is useful in the following situations:

- When a class cannot anticipate the type of objects it needs to create, or when the class wants its subclasses to specify the objects it creates.

- When the creation of objects involves complex logic or requires a specific setup, and you want to encapsulate this logic within a separate factory method to keep the main code clean and maintainable.

- When you want to provide an interface for creating families of related or dependent objects without specifying their concrete classes. The Factory Method pattern can be easily extended to support new object types, making the system more flexible and adaptable to changes.

- When you want to improve code reusability and modularity by decoupling the object creation process from the specific classes that implement those objects. This makes the code more maintainable, as changes to the object creation process will not affect the rest of the application.

In summary, the Factory Method pattern is a valuable design pattern when you need to create objects with varying types or complexities, and you want to maintain a clean and flexible codebase. By encapsulating the object creation logic within factory methods, the pattern allows for easy extension, improved reusability, and better maintainability.

### Example:

Using the CarFactory  project as an example, let's describe how the Factory Method pattern is applied:

1. Product: The Vehicle interface represents the Product in the Factory Method pattern. It defines the common methods for all vehicle types, such as starting the engine and configuring the vehicle.

```java
public interface Vehicle {
    void startEngine();
    void configure(String configuration);
}
```

2. Concrete Product: The Car, ElectricCar, and Truck classes represent Concrete Products. They implement the Vehicle interface, providing specific implementations for each vehicle type.

```java
public class Car implements Vehicle { /* ... */ }
public class ElectricCar implements Vehicle { /* ... */ }
public class Truck implements Vehicle { /* ... */ }
```

3. Creator: The VehicleFactory interface represents the Creator in the Factory Method pattern. It declares the factory methods createVehicle() and createConfiguredVehicle(configuration) for creating Vehicle objects.

```java
public interface VehicleFactory {
    Vehicle createVehicle();
    Vehicle createConfiguredVehicle(String configuration);
}
```

4. Concrete Creator: The CarFactory, ElectricCarFactory, and TruckFactory classes represent Concrete Creators. They implement the VehicleFactory interface, providing specific factory methods for creating and configuring their respective vehicle types.

```java
public class CarFactory implements VehicleFactory { /* ... */ }
public class ElectricCarFactory implements VehicleFactory { /* ... */ }
public class TruckFactory implements VehicleFactory { /* ... */ }
```

5. The VehicleType enum associates each vehicle type with its corresponding factory, providing an easy way to create and configure vehicles based on their types.

```java
public enum VehicleType {
    TRUCK(new TruckFactory()),
    CAR(new CarFactory()),
    ELECTRIC(new ElectricCarFactory());

    private final VehicleFactory factory;

    VehicleType(VehicleFactory factory) {
        this.factory = factory;
    }

    public Vehicle createVehicle() {
        return factory.createVehicle();
    }

}
```

6. The VehicleFactoryClient class demonstrates the usage of the Factory Method pattern. It provides a simple interface for creating and configuring vehicles based on their types, using the VehicleType enum and the corresponding factory methods.

```java
public class VehicleFactoryClient {
    public Vehicle getVehicle(VehicleType vehicleType) {
        return vehicleType.createVehicle();
    }

}
```

In this example, the Factory Method pattern allows for the creation and configuration of different vehicle types through a consistent interface. By encapsulating the object creation process within factory methods, the pattern makes it easy to add new vehicle types or modify existing ones without affecting the rest of the codebase, promoting code reusability and maintainability.

## CarFactory Project Overview:

The project is a simple vehicle management system that demonstrates the use of the Factory Method pattern in object creation. The project includes different vehicle types, such as Car, ElectricCar, and Truck. It allows creating and configuring vehicles through a consistent interface, making the process of creating new vehicles and adding new vehicle types more flexible and maintainable.

### The project contains the following components:

1. Vehicle interface: Defines the common methods for all vehicle types, such as starting the engine and configuring the vehicle.
2. Vehicle classes: Car, ElectricCar, and Truck classes that implement the Vehicle interface, providing specific implementations for each vehicle type.
3. VehicleFactory interface: Defines the factory methods for creating vehicles and configured vehicles.
4. Vehicle factory classes: CarFactory, ElectricCarFactory, and TruckFactory classes that implement the VehicleFactory interface, providing a specific factory for each vehicle type.
5. VehicleType enum: Represents the different vehicle types and associates them with their respective factories.
6. VehicleFactoryClient class: A class that provides a simple interface for creating and configuring vehicles based on their types.
7. Main class: A class that demonstrates the use of the VehicleFactoryClient to create and configure vehicles.

### The UML Diagram of the project:

<img width="767" alt="UML - Car Factory jpg " src="https://user-images.githubusercontent.com/121272886/232270258-73afa1c9-7d00-4c89-89e7-b7da9b4332d5.png">


### Significance of Factory Method pattern:

The Factory Method pattern is essential in this project as it provides a way to decouple the process of creating objects from the specific classes that implement those objects. By doing so, it becomes easier to add new vehicle types or modify existing ones without affecting the rest of the codebase. The pattern also promotes code reusability and maintainability by centralizing object creation and configuration.

### How to use the project:

To use the project, follow these steps:

1. Compile and run the Main class. This will create instances of Car, ElectricCar, and Truck, start their engines, and configure them with different options.

2. To add a new vehicle type, create a new class that implements the Vehicle interface and provide the specific implementation for the new vehicle type.

3. Create a new factory class for the new vehicle type that implements the VehicleFactory interface and provides the specific factory methods for creating and configuring the new vehicle type.

4. Update the VehicleType enum to include the new vehicle type and associate it with the new factory class.

5. Use the VehicleFactoryClient class to create and configure instances of the new vehicle type by passing the appropriate VehicleType enum value to the getVehicle and getConfiguredVehicle methods.

The Factory Method pattern allows the project to easily accommodate new vehicle types and configurations while keeping the code clean and maintainable.
