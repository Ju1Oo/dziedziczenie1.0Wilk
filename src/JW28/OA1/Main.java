package JW28.OA1;


public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("murzyn", "Kamel");
        Car auto = new Car("volkswagen", "pasat", 2010, owner1, 100000, "124adawfaw", "czerwony", 140,5,"sedan");
        VehicleRegistry v = new VehicleRegistry();

        v.addVehicleFromUser();
        v.displayAllVehicles();

    }
}