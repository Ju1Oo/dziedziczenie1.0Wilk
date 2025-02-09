package JW28.OA1;

public class Helicopter extends FlyingVehicle {
    private int rotorDiameter;


    public Helicopter(String brand, String model, int yearOfProduction, Owner owner, int maxAltitude, int maxSpeed, int rotorDiameter) {
        super(brand, model, yearOfProduction, owner, maxAltitude, maxSpeed);
        this.rotorDiameter = rotorDiameter;

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Srednica wirnika: " + rotorDiameter + " m");
    }
}
