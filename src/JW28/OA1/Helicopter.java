package JW28.OA1;

public class Helicopter extends FlyingVehicle {
    private int rotorDiameter;
    private boolean hasAutoPilot;

    public Helicopter(String brand, String model, int yearOfProduction, Owner owner, int maxAltitude, int maxSpeed, int rotorDiameter, boolean hasAutoPilot) {
        super(brand, model, yearOfProduction, owner, maxAltitude, maxSpeed);
        this.rotorDiameter = rotorDiameter;
        this.hasAutoPilot = hasAutoPilot;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Srednica wirnika: " + rotorDiameter + " m");
        System.out.println("Autopilot: " + (hasAutoPilot ? "Tak" : "Nie"));
    }
}
