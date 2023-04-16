package cars;

/**
 * This class represents an implementation of the VehicleFactory interface for creating trucks.
 */

public class TruckFactory implements VehicleFactory {
  @Override
  public Vehicle createVehicle() {
    return new Truck();
  }

  @Override
  public Vehicle createConfiguredVehicle(String configuration) {
    Truck truck = new Truck();
    truck.configure(configuration);
    return truck;
  }
}
