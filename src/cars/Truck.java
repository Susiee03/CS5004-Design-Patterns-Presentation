package cars;


/**
 * This class represents a truck that implements the Vehicle interface.
 */
public class Truck implements Vehicle {
  @Override
  public void startEngine() {
    System.out.println("started a large engine of truck ...");
  }

  @Override
  public void configure(String configuration) {
    System.out.println("Truck configured with: " + configuration);
  }
}
