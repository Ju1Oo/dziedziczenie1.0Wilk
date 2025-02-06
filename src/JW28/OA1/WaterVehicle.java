package JW28.OA1;

public class WaterVehicle extends Vehicle{

    private String registration;
    private int weightInKg;


    public WaterVehicle(String brand, String model, int yearOfProduction, Owner owner,String registration, int weightInKg) {
        super(brand, model, yearOfProduction, owner);
        this.registration = registration;
        this.weightInKg = weightInKg;
    }

    @Override
    protected void displayInfo()
    {
        super.displayInfo();
        System.out.println("rejestracja: " + this.registration);
        System.out.println("waga: " + this.weightInKg + "kg");
    }

}
