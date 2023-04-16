package cars;


/**
 * This class represents an implementation of the VehicleFactory interface for creating cars.
 */
public class CarFactory implements VehicleFactory {
  @Override
  public Vehicle createVehicle() {
    return new Car();
  }

  @Override
  public Vehicle createConfiguredVehicle(String configuration) {
    Car car = new Car();
    car.configure(configuration);
    return car;
  }
}
