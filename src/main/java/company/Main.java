package company;


import com.rent.company.domain.RentCompany;
import com.rent.company.service.RentCompanyService;
import com.rent.company.service.RentCompanyServiceImpl;

import java.util.Scanner;


public class Main {

    //zad1. dodawanie wypozyczalni

    //zad2. dodawanie i usuwanie oddzialow z wypozyczalni

    //zad3. tworzenie pracownikow

    //zad4. przypisywanie praconikow do oddzialu

    //zad5. tworzenie klienta

    //zad6. tworzenie samochodu

    //zad7. wypozyczenie samochodu...

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RentCompanyService rentCompanyService = new RentCompanyServiceImpl();



        System.out.println("How program works:");

        System.out.println("Option 1 to create new company - pass all needed info");

        System.out.println("Option 2 to create department for given company");

        System.out.println("Option 3 display company with departments");

        System.out.println("Option 4 exit program");



        String action = "";

        while (!action.equalsIgnoreCase("4")) {

            action = scanner.nextLine();

            if (action.equalsIgnoreCase("1")) {

                RentCompany newCompany = createCompany(scanner, rentCompanyService);



            } else if (action.equalsIgnoreCase("2")) {





            } else if (action.equalsIgnoreCase("3")) {



            }





        }





    }



    private static RentCompany createCompany(Scanner scanner, RentCompanyService rentCompanyService) {

        String name = scanner.nextLine();

        String website = scanner.nextLine();

        String address = scanner.nextLine();

        String owner = scanner.nextLine();

        String logo = scanner.nextLine();

        return rentCompanyService.createNewCompany(name, website,

                address, owner, logo);

    }





}