# CS5004-Design-Patterns-Presentation

## Project Overview:

The project is a simple vehicle management system that demonstrates the use of the Factory Method pattern in object creation. The project includes different vehicle types, such as Car, ElectricCar, and Truck. It allows creating and configuring vehicles through a consistent interface, making the process of creating new vehicles and adding new vehicle types more flexible and maintainable.

### The project contains the following components:

1. Vehicle interface: Defines the common methods for all vehicle types, such as starting the engine and configuring the vehicle.
2. FuelType enum: Represents the fuel types for the vehicles, like GASOLINE, DIESEL, and ELECTRIC.
3. Vehicle classes: Car, ElectricCar, and Truck classes that implement the Vehicle interface, providing specific implementations for each vehicle type.
4. VehicleFactory interface: Defines the factory methods for creating vehicles and configured vehicles.
5. Vehicle factory classes: CarFactory, ElectricCarFactory, and TruckFactory classes that implement the VehicleFactory interface, providing a specific factory for each vehicle type.
6. VehicleType enum: Represents the different vehicle types and associates them with their respective factories.
7. VehicleFactoryClient class: A class that provides a simple interface for creating and configuring vehicles based on their types.
8. Main class: A class that demonstrates the use of the VehicleFactoryClient to create and configure vehicles.

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
