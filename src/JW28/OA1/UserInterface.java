package JW28.OA1;

import java.util.Scanner;

public class UserInterface {

     VehicleRegistry v = new VehicleRegistry();

    public void interfaceLoop()
    {
        boolean endProgram = false;
        int caseNum = 0;
        while(!endProgram)
        {
            caseNum = chooseAction();
            switch (caseNum)
            {
                case 1:
                    v.addVehicleFromUser();
                    break;
                case 2:
                    v.displayAllVehicles();
                    break;
                case 3:
                    v.displayVehiclesByType(chooseVehicleType());
                    break;
                case 4:
                    System.out.println("Zakonczanie programu");
                    endProgram = true;
                    break;
                default:
                    System.out.println("Wybrano niewłaściwą opcje");
            }
            System.out.println();
            System.out.println("-----------------------------------");
            System.out.println();
        }
        System.exit(0);
    }

    private Class<? extends Vehicle> chooseVehicleType() {
        Scanner scanner = new Scanner(System.in);
        Class<? extends Vehicle> vehicleType = null;
        boolean loop = true;

        while (loop) {
            System.out.println("<------ Podaj typ pojazdu ------>");
            System.out.println("        1: Auto");
            System.out.println("        2: Samolot");
            System.out.println("        3: Helikopter");
            System.out.println("        4: Ciężarówka");
            System.out.println("        5: Motocykl");
            System.out.println("        6: Wycieczkowiec");
            System.out.println("        7: Kontenerowiec");


            if (scanner.hasNextInt()) {
                int a = scanner.nextInt();

                switch (a) {
                    case 1:
                        vehicleType = Car.class;
                        loop = false;
                        break;

                    case 2:
                        vehicleType = Airplane.class;
                        loop = false;
                        break;

                    case 3:
                        vehicleType = Helicopter.class;
                        loop = false;
                        break;

                    case 4:
                        vehicleType = Truck.class;
                        loop = false;
                        break;

                    case 5:
                        vehicleType = Motorcycle.class;
                        loop = false;
                        break;

                    case 6:
                        vehicleType = Cruiser.class;
                        loop = false;
                        break;

                    case 7:
                        vehicleType = ContainerShip.class;
                        loop = false;
                        break;

                    default:
                        System.out.println("Podany pojazd nie istnieje, spróbuj ponownie.");
                }
            } else {
                System.out.println("Proszę wprowadzić liczbę.");
                scanner.next();
            }
        }


        return vehicleType;
    }

    private int chooseAction()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("<------ Wybierz akcje ------>");
        System.out.println("        1: Dodaj pojazd");
        System.out.println("        2: Wyswietl wszystkie pojazdy");
        System.out.println("        3: Wyswietl wszystkie pojazdy danego typu");
        System.out.println("        4: Zakoncz program");
        System.out.println("<--------------------------->");

        return scanner.nextInt();
    }
}
