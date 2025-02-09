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



    private int chooseAction()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("<------ Wybierz akcje ------>");
        System.out.println("        1: Dodaj pojazd");
        System.out.println("        2: Wyswietl wszystkie pojazdy");
        System.out.println("        3: Zakoncz program");
        System.out.println("<--------------------------->");

        return scanner.nextInt();
    }
}
