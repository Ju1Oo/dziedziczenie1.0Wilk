package JW28.OA1;
import java.util.ArrayList;
import java.util.Scanner;
public class VehicleRegistry {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Dodano nowy pojazd: ");
        vehicle.displayInfo();
    }

    public void addVehicleFromUser() {                                      // Jebac nextInt trzeba dodac nextLine po kazdym bo sie buguje XDDDDDDDDDD
        System.out.println("<------ Podaj typ pojazdu ------>");
        System.out.println("        1: Auto");
        System.out.println("        2: Samolot");
        System.out.println("        3: Helikopter");
        System.out.println("        4: Ciężarówka");
        System.out.println("        5: Motocykl");
        System.out.println("        6: Wycieczkowiec");
        System.out.println("        7: Kontenerowiec");

        int type = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Podaj markę: ");
        String brand = scanner.nextLine();
        System.out.println("Podaj model: ");
        String model = scanner.nextLine();
        System.out.println("Podaj rok produkcji: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("podaj imię właściciela: ");
        String name = scanner.nextLine();
        System.out.println("podaj nazwisko właściciela: ");
        String surname = scanner.nextLine();


        Owner owner = new Owner(name, surname);

        switch (type) {
            case 1:
                System.out.println("Podaj przebieg (km): ");
                int mileage = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Podaj rejestrację: ");
                String registration = scanner.nextLine();
                System.out.println("Podaj kolor: ");
                String color = scanner.nextLine();
                System.out.println("Podaj maksymalną prędkość: ");
                int maxVelocity = scanner.nextInt();
                System.out.println("Podaj ilość miejsc: ");
                int seats = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Podaj typ nadwozia: ");
                String bodyStyle = scanner.nextLine();

                addVehicle(new Car(brand, model, year, owner, mileage, registration, color, maxVelocity, seats, bodyStyle));
                break;

            case 2:
                System.out.println("Podaj maksymalną wysokość lotu: ");
                int maxAltitude = scanner.nextInt();
                System.out.println("Podaj maksymalną prędkość: ");
                int maxSpeed = scanner.nextInt();
                System.out.println("Podaj rozpiętość skrzydeł: ");
                int wingspan = scanner.nextInt();
                System.out.println("Podaj liczbę silników: ");
                int engineCount = scanner.nextInt();
                scanner.nextLine();

                addVehicle(new Airplane(brand, model, year, owner, maxAltitude, maxSpeed, wingspan, engineCount));
                break;

            case 3:
                System.out.println("Podaj maksymalną wysokość lotu: ");
                int maxAltitudeH = scanner.nextInt();
                System.out.println("Podaj maksymalną prędkość: ");
                int maxSpeedH = scanner.nextInt();
                System.out.println("Podaj średnicę wirnika: ");
                int rotorDiameter = scanner.nextInt();
                System.out.println("Czy posiada autopilota? (true/false): ");
                boolean hasAutoPilot = scanner.nextBoolean();
                scanner.nextLine();

                addVehicle(new Helicopter(brand, model, year, owner, maxAltitudeH, maxSpeedH, rotorDiameter, hasAutoPilot));
                break;

            case 4:
                System.out.println("Podaj przebieg (km): ");
                int mileageT = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Podaj rejestrację: ");
                String registrationT = scanner.nextLine();
                System.out.println("Podaj kolor: ");
                String colorT = scanner.nextLine();
                System.out.println("Podaj maksymalną prędkość: ");
                int maxVelocityT = scanner.nextInt();
                System.out.println("Podaj maksymalną wage ładunku (kg): ");
                int maxLoad = scanner.nextInt();
                System.out.println("Podaj maksymalny rozmiar ładunku (m^2): ");
                int cargo = scanner.nextInt();

                addVehicle(new Truck(brand, model, year, owner,  mileageT, registrationT, colorT,  maxVelocityT, maxLoad,  cargo));
                break;

            case 5:

                System.out.println("Podaj przebieg (km): ");
                int mileageM = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Podaj rejestrację: ");
                String registrationM = scanner.nextLine();
                System.out.println("Podaj kolor: ");
                String colorM = scanner.nextLine();
                System.out.println("Podaj maksymalną prędkość: ");
                int maxVelocityM = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Podaj typ motocykla: ");
                String motorcycleType = scanner.nextLine();

                addVehicle(new Motorcycle(brand, model, year, owner, mileageM, registrationM, colorM, maxVelocityM,motorcycleType));
                break;

            case 6:
                System.out.println("Podaj rejestrację: ");
                String registrationC = scanner.nextLine();
                System.out.println("Podaj wagę (kg): ");
                int weightC = scanner.nextInt();
                System.out.println("Podaj liczbę miejsc pasażerskich: ");
                int seatsC = scanner.nextInt();
                System.out.println("Podaj liczbę kabin: ");
                int numOfCabins = scanner.nextInt();
                scanner.nextLine();

                addVehicle(new Cruiser(brand, model, year, owner, registrationC, weightC, seatsC, numOfCabins));
                break;

            case 7:
                System.out.println("Podaj rejestrację: ");
                String registrationCS = scanner.nextLine();
                System.out.println("Podaj wagę (kg): ");
                int weightCS = scanner.nextInt();
                System.out.println("Podaj maksymalną ilość kontenerów: ");
                int containerCount = scanner.nextInt();
                System.out.println("Podaj maksymalny ładunek (kg): ");
                int maxLoadC = scanner.nextInt();
                scanner.nextLine();

                addVehicle(new ContainerShip(brand, model, year, owner, registrationCS, weightCS, containerCount, maxLoadC));
                break;

            default:
                System.out.println("Nieznany typ pojazdu.");
                break;
        }
    }

    public void displayAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("----------------------------");
        }
    }


}
