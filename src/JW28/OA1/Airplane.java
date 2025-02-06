package JW28.OA1;

public class Airplane extends FlyingVehicle {
    private int wingspan;
    private int engineCount;

    public Airplane(String brand, String model, int yearOfProduction, Owner owner, int maxAltitude, int maxSpeed, int wingspan, int engineCount) {
        super(brand, model, yearOfProduction, owner, maxAltitude, maxSpeed);
        this.wingspan = wingspan;
        this.engineCount = engineCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Rozpietosc skrzydel: " + wingspan + " m");
        System.out.println("Liczba silnikow: " + engineCount);
    }
}