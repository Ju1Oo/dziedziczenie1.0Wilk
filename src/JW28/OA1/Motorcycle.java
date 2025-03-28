package JW28.OA1;

public class Motorcycle extends GroundVehicle {

    private String motorcycleType; // e.g chopper,enduro

    public Motorcycle(String brand, String model, int yearOfProduction, Owner owner, int mileageInKm, String registration, String paintColor, int maxVelocityInKm,String motorcycleType) {
        super(brand, model, yearOfProduction, owner, mileageInKm, registration, paintColor, maxVelocityInKm);
        this.motorcycleType = motorcycleType;
    }
  @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("typ motocykla: " + this.motorcycleType);

    }

}
