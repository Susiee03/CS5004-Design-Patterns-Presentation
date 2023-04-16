package cars;


/**
 * This class represents an implementation of the VehicleFactory interface for
 * creating electric cars.
 */
public class ElectricCarFactory implements VehicleFactory {
  @Override
  public Vehicle createVehicle() {
    return new ElectricCar();
  }

  @Override
  public Vehicle createConfiguredVehicle(String configuration) {
    ElectricCar electricCar = new ElectricCar();
    electricCar.configure(configuration);
    return electricCar;
  }
}
