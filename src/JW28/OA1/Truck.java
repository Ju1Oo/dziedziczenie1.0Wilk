package JW28.OA1;

public class Truck extends GroundVehicle {
    private int maxLoadInKg;
    private int cargoCapacity; // max volume of load in square meters

    public Truck(String brand, String model, int yearOfProduction, Owner owner, int mileageInKm, String registration, String paintColor, int maxVelocityInKm, int maxLoadInKg, int cargoCapacity) {
        super(brand, model, yearOfProduction, owner, mileageInKm, registration, paintColor, maxVelocityInKm);
        this.maxLoadInKg = maxLoadInKg;
        this.cargoCapacity = cargoCapacity;
    }
  @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("maksymalny ładonek: " + this.maxLoadInKg + "kg lub" + this.cargoCapacity + "m^2");
    }

}
