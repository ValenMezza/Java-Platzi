package UI;

import java.util.Scanner;

public class UIMenu {
    public static String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void showMenu() {
        System.out.println("Welcome to my appointments");
        System.out.println("Select one option");
        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    System.out.println("Patient");
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }


    public static void showPatientMenu() {
        int response= 0;
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Exit");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());


            switch (response) {
                case 1:
                    System.out.println("Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    System.out.println("chau");
                    break;
                case 2:
                    System.out.println("My Appointments");
                    break;
                case 0:
                    System.out.println("Gracias por su visita");
                    break;
                default:
                    showMenu();
                    break;
            }
        }while (response!=0);
    }
}