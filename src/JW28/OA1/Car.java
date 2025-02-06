package JW28.OA1;

public class Car extends GroundVehicle{
    private int seats;
    private String bodyStyle; //e.g sedan suv

    public Car(String brand, String model, int yearOfProduction, Owner owner, int mileageInKm, String registration, String paintColor, int maxVelocityInKm, int seats, String bodyStyle) {
        super(brand, model, yearOfProduction, owner, mileageInKm, registration, paintColor, maxVelocityInKm);
        this.seats = seats;
        this.bodyStyle = bodyStyle;
    }



    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("ilosc miejsc: " + seats);
        System.out.println("rodzaj nadwozia: " + bodyStyle);
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
