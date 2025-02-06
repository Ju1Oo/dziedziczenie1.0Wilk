package JW28.OA1;

public abstract class FlyingVehicle extends Vehicle {
    private int maxAltitude;
    private int maxSpeed;

    public FlyingVehicle(String brand, String model, int yearOfProduction, Owner owner, int maxAltitude, int maxSpeed) {
        super(brand, model, yearOfProduction, owner);
        this.maxAltitude = maxAltitude;
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Maksymalna wysokosc lotu: " + maxAltitude + " m");
        System.out.println("Maksymalna predkosc: " + maxSpeed + " km/h");
    }
}