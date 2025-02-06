package JW28.OA1;

 public abstract class Vehicle {
    private String brand;
    private String model;
    private int yearOfProduction;
    private Owner owner;

    public Vehicle(String brand,String model,int yearOfProduction,Owner owner)
    {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.owner = owner;
    }

    public void displayInfo()
    {

    }
}
