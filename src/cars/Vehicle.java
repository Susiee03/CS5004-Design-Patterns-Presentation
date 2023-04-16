package cars;


/**
 * The Vehicle interface represents a vehicle that can be started and configured.
 */

public interface Vehicle {

  /**
   * Starts the engine of the vehicle.
   */
  void startEngine();

  /**
   * Configures the vehicle with the given configuration.
   * @param configuration The configuration to be applied to the vehicle.
   */
  void configure(String configuration);
}
