package company;

import company.domain.Department;
import company.domain.Employee;
import company.domain.RentCompany;
import company.service.RentCompanyService;
import company.service.RentCompanyServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    //zad5. tworzenie klienta
    //zad6. tworzenie samochodu
    //zad6b rozbudowanie aplikacji o zarzadzanie wieloma firmami
    //zad7. wypozyczenie samochodu...
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentCompanyService rentCompanyService = new RentCompanyServiceImpl();
        RentCompany newCompany = null;
        showInstructions();

        String action = "";
        while (!action.equalsIgnoreCase("10")) {
            action = scanner.nextLine();
            if (action.equalsIgnoreCase("1")) {
                System.out.println("Creating new company");
                newCompany = createCompany(scanner, rentCompanyService);
                System.out.println("New company created");
            } else if (action.equalsIgnoreCase("2")) {
                System.out.println("Creating new departament");
                if (newCompany != null) {
                    newCompany = handleCompanyDepartments(scanner, rentCompanyService, newCompany);
                    System.out.println("New departament created");
                } else {
                    System.out.println("First you need create company");
                }
            } else if (action.equalsIgnoreCase("3")) {
                System.out.println("Display company status");
                System.out.println(newCompany);

            } else if (action.equalsIgnoreCase("4")) {
                System.out.println("Creating empolyee with department ,pass firstName, lastName, manager, dept address");
                addNewEmployeeWithDepartment(scanner, newCompany, rentCompanyService);
            } else if (action.equalsIgnoreCase("5")) {
                System.out.println("Creating client");
//todo
            } else if (action.equalsIgnoreCase("6")) {
                System.out.println("Creating car");
//todo
            }


        }


    }

    public static void addNewEmployeeWithDepartment(Scanner scanner, RentCompany newCompany, RentCompanyService rentCompanyService) {
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String isManagerString = scanner.nextLine();
        boolean isManager = isManagerString.equalsIgnoreCase("y");
        String deptartamentAddress = scanner.nextLine();

        rentCompanyService.addEmployeWithParams(newCompany, firstName, lastName, isManager, deptartamentAddress);
    }


    private static RentCompany handleCompanyDepartments(Scanner scanner, RentCompanyService rentCompanyService, RentCompany newCompany) {
        System.out.println("Do you want to create(1) or delete(2) departament ");
        String userChoice = scanner.nextLine();
        System.out.println("Enter departmens address");
        String address = scanner.nextLine();

        newCompany = rentCompanyService.handleDepartmentsFromCompany(newCompany, userChoice, address);
        return newCompany;
    }


    private static void showInstructions() {
        System.out.println("How program works:");
        System.out.println("Option 1 to create new company - pass all needed info");
        System.out.println("Option 2 to create department for given company");
        System.out.println("Option 3 display company with departments");
        System.out.println("Option 4 add new worker to given departament");
        System.out.println("Option 5 add new client");
        System.out.println("Option 6 add new car");
        System.out.println("Option 7 rent a car");
        System.out.println("Option 10 exit program");

    }


    private static RentCompany createCompany(Scanner scanner, RentCompanyService rentCompanyService) {
        System.out.println("Pass params");
        String name = scanner.nextLine();
        String website = scanner.nextLine();
        String address = scanner.nextLine();
        String owner = scanner.nextLine();
        String logo = scanner.nextLine();
        System.out.println("Passed all params");
        return rentCompanyService.createNewCompany(name, website,
                address, owner, logo);
    }


}
