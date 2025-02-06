package JW28.OA1;

public class Cruiser extends WaterVehicle{

    private int seats;
    private int numOfCabins;

    public Cruiser(String brand, String model, int yearOfProduction, Owner owner, String registration, int weightInKg,int seats,int numOfCabins) {
        super(brand, model, yearOfProduction, owner, registration, weightInKg);
        this.seats = seats;
        this.numOfCabins = numOfCabins;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("maks. liczba pasazerow: " + this.seats);
        System.out.println("liczba kabin: " + this.numOfCabins);
    }
}
