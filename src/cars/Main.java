package cars;

/**
 * Run the car factory.
 */
public class Main {
  /**
   * Run a car factory implement on the console.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    VehicleFactoryClient factoryClient = new VehicleFactoryClient();

    Vehicle car = factoryClient.getVehicle(VehicleType.CAR);
    car.startEngine();
    car.configure("Leather seats, sunroof");

    Vehicle electricCar = factoryClient.getVehicle(VehicleType.ELECTRIC);
    electricCar.startEngine();
    electricCar.configure("Regenerative braking, autopilot");

    Vehicle truck = factoryClient.getVehicle(VehicleType.TRUCK);
    truck.startEngine();
    truck.configure("Heavy-duty suspension, extended cargo bed");
  }
}
