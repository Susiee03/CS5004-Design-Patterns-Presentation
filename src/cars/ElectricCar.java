package cars;


/**
 * This class represents an implementation of the Vehicle interface for an electric car.
 */
public class ElectricCar implements Vehicle {
  @Override
  public void startEngine() {
    System.out.println("pushed button started electric car's engine...");
  }

  @Override
  public void configure(String configuration) {
    System.out.println("Electric Car configured with: " + configuration);
  }
}
