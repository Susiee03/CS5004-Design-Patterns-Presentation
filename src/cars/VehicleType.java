package cars;


/**
 * This enum represents the available types of vehicles, each associated with a
 * corresponding VehicleFactory.
 */
public enum VehicleType {
  /**
   * Truck type.
   */
  TRUCK(new TruckFactory()),

  /**
   * Car type.
   */
  CAR(new CarFactory()),

  /**
   * Electric car type.
   */
  ELECTRIC(new ElectricCarFactory());

  private final VehicleFactory factory;

  VehicleType(VehicleFactory factory) {
    this.factory = factory;
  }

  /**
   * CreateVehicle, creates and returns an instance of the corresponding vehicle type
   * using the associated VehicleFactory.
   * @return The created vehicle instance.
   */
  public Vehicle createVehicle() {
    return factory.createVehicle();
  }

}
