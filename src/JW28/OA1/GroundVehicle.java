package JW28.OA1;

public class GroundVehicle extends  Vehicle{

    private int mileageInKm;
    private String registration;
    private  String paintColor;

    public GroundVehicle(String brand, String model, int yearOfProduction, Owner owner,int mileageInKm,String registration,String paintColor) {
        super(brand, model, yearOfProduction, owner);
        this.mileageInKm = mileageInKm;
        this.registration = registration;
        this.paintColor = paintColor;

    }

    public String getPaintColor() {
        return paintColor;
    }

    public void setPaintColor(String paintColor) {
        this.paintColor = paintColor;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getMileageInKm() {
        return mileageInKm;
    }

    public void setMileageInKm(int mileageInKm) {
        this.mileageInKm = mileageInKm;
    }
}
