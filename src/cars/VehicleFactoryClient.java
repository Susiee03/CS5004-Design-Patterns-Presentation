package cars;

/**
 * This class represents a client for the VehicleFactory that creates and returns
 * instances of vehicles based on the given vehicle type.
 */
public class VehicleFactoryClient {

  /**
   * Returns an instance of a vehicle based on the given vehicle type.
   * @param vehicleType The type of vehicle to create.
   * @return The created vehicle instance.
   */
  public Vehicle getVehicle(VehicleType vehicleType) {
    return vehicleType.createVehicle();
  }

}
