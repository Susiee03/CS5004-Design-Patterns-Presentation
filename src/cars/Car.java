package cars;


/**
 * This class represents a basic implementation of a car that implements the Vehicle interface.
 */
public class Car implements Vehicle {
  @Override
  public void startEngine() {
    System.out.println("started simple engine of car...");
  }

  @Override
  public void configure(String configuration) {
    System.out.println("Car configured with: " + configuration);
  }


}
