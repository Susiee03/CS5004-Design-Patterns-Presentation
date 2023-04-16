package cars;

/**
 * The vehicleFactory interface represents a vehicle factory for creating vehicles.
 */

public interface VehicleFactory {

  /**
   * Creates a new instance of a vehicle.
   * @return The created vehicle instance.
   */
  Vehicle createVehicle();

  /**
   * Creates a new instance of a vehicle that is pre-configured with the given configuration.
   * @param configuration The configuration to be applied to the vehicle.
   * @return The created vehicle instance with the applied configuration.
   */
  Vehicle createConfiguredVehicle(String configuration);
}
