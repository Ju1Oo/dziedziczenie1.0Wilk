package JW28.OA1;

public abstract class GroundVehicle extends  Vehicle{

    private int mileageInKm;
    private String registration;
    private  String paintColor;
    private int maxVelocityInKm;

    public GroundVehicle(String brand, String model, int yearOfProduction, Owner owner,int mileageInKm,String registration,String paintColor,int maxVelocityInKm) {
        super(brand, model, yearOfProduction, owner);
        this.mileageInKm = mileageInKm;
        this.registration = registration;
        this.paintColor = paintColor;
        this.maxVelocityInKm = maxVelocityInKm;
    }

    @Override
    protected void displayInfo()
    {
        super.displayInfo();
        System.out.println("Przebieg: " + this.mileageInKm);
        System.out.println("Rejestracja: " + this.registration);
        System.out.println("Kolor: " + this.paintColor);
        System.out.println("Predkosc maksymalna: " + this.maxVelocityInKm);
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

    public int getMaxVelocityInKm() {
        return maxVelocityInKm;
    }

    public void setMaxVelocityInKm(int maxVelocityInKm) {
        this.maxVelocityInKm = maxVelocityInKm;
    }
}
