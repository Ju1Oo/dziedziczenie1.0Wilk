package JW28.OA1;

public class GroundVehicle extends  Vehicle{

    private int mileageInKm;
    private String registration;
    private  String paintColor;

    public GroundVehicle(String brand, String model, int yearOfProduction, Owner owner) {
        super(brand, model, yearOfProduction, owner);

    }
}
