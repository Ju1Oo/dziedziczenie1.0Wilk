package JW28.OA1;

public class ContainerShip extends WaterVehicle {

    private int containerCount;
    private int maxLoadInKg;

    public ContainerShip(String brand, String model, int yearOfProduction, Owner owner, String registration, int weightInKg,int containerCount,int maxLoadInKg) {
        super(brand, model, yearOfProduction, owner, registration, weightInKg);
        this.containerCount = containerCount;
        this.maxLoadInKg = maxLoadInKg;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("maks. waga ładunku: " + this.maxLoadInKg + "kg");
        System.out.println("maks. ilosc konetenerow: " + this.containerCount);
    }
}
