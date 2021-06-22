package controllers;

import commons.FileUtils;
import commons.StringUtils;
import models.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MainController {

    static List<Villa> villaList = new ArrayList<>();
    static List<House> houseList = new ArrayList<>();
    static List<Room> roomList = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);
    private static String VILLA = "villa";
    private static String HOUSE = "house";
    private static String ROOM = "room";
    private static boolean isBackToMenu;

    public static void main(String[] args) throws IOException {
        MainController.displayMainMenu();
    }

    public static void displayMainMenu() throws IOException {
        int choice = -1;
        do {
            System.out.println("======= FURAMA =======" +
                    "\n 1. Add New Services" +
                    "\n 2. Show Services" +
                    "\n 3. Add New Customer" +
                    "\n 4. Show Information Of Customer" +
                    "\n 5. Add New Booking" +
                    "\n 6. Show Information Of Employee" +
                    "\n 7. Exit");
            System.out.print(" Enter choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationOfCustomer();
                    break;
                case 5:
                    addNewBoking();
                    break;
                case 6:
                    showInformationEmployee();
                    break;
                case 7:
                    System.exit(0);
            }
        } while (choice >= 1 && choice <= 7);
    }

    private static void showInformationEmployee() {
    }

    private static void addNewBoking() {
    }

    private static void showInformationOfCustomer() {
    }

    private static void addNewCustomer() {
    }



    public static void addNewServices() throws IOException {
        int choice = -1;
        do {
            System.out.println(" 1. Add New Villa" +
                    "\n 2. Add New House" +
                    "\n 3. Add New Room" +
                    "\n 4. Back To Menu" +
                    "\n 5. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewService(VILLA);
                    isBackToMenu = false;
                    break;
                case 2:
                    addNewService(HOUSE);
                    isBackToMenu = false;

                    break;
                case 3:
                    addNewService(ROOM);
                    isBackToMenu = false;

                    break;
                case 4:
                    isBackToMenu = true;
                    break;
                case 5:
                    System.exit(0);
            }
            if (isBackToMenu) {
                return;
            }
        } while (choice >= 1 && choice <= 5);
    }

// 1. Add New Service
    private static void addNewService(String fileName) throws IOException {
        scanner.nextLine();
        System.out.print("Enter Id: ");
        String id = scanner.nextLine();
        System.out.print("Enter NameService: ");
        String nameService = scanner.nextLine();
        System.out.println("Enter Area Use: ");
        double areaUse = scanner.nextDouble();
        System.out.print("Enter Retalcost: ");
        double retalCost = scanner.nextDouble();
        System.out.print("Enter number of people: ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Rental Type: ");
        String rentalType = scanner.nextLine();

        FileUtils.setFullPathFile(fileName);

        // Add Villa
        if (fileName.equals(VILLA)) {
            System.out.print("Enter Room Standard: ");
            String roomStandard = scanner.nextLine();
            System.out.println("Enter Other Facilities: ");
            String otherFacilities = scanner.nextLine();
            System.out.println("Enter Pool Area: ");
            double poolArea = scanner.nextDouble();
            System.out.println("Enter Number Of Floor: ");
            int numberOfFloor = scanner.nextInt();

            // write villa to file
            FileUtils.writeFile(new String[]{id, nameService, roomStandard, String.valueOf(retalCost), String.valueOf(numberOfPeople), rentalType,
                    roomStandard, otherFacilities, String.valueOf(poolArea), String.valueOf(numberOfFloor)});
        }

        // Add House
        else if (fileName.equals(HOUSE)) {
            System.out.print("Enter Room Standard: ");
            String roomStandard = scanner.nextLine();
            System.out.println("Enter Other Facilities: ");
            String otherFacilities = scanner.nextLine();
            System.out.println("Enter Number Of Floor: ");
            int numberOfFloor = scanner.nextInt();

            // write house to file
            FileUtils.writeFile(new String[]{id, nameService, roomStandard, String.valueOf(retalCost), String.valueOf(numberOfPeople), rentalType,
                    roomStandard, otherFacilities, String.valueOf(numberOfFloor)});
        }

        // Add Room
        else if (fileName.equals(ROOM)) {
            System.out.println("Enter Free Service Name: ");
            String freeServiceName = scanner.nextLine();
            System.out.println("Enter unit: ");
            String unit = scanner.nextLine();
            System.out.println("Enter money: ");
            double money = scanner.nextDouble();

            // write room to file
            FileUtils.writeFile(new String[]{freeServiceName, unit, String.valueOf(money)});
        }
    }
    //======================================================================================================

    private static void showServices() {
        int choice = -1;
        do {
            System.out.println(" 1. Show All Villa " +
                    "\n 2. Show All House " +
                    "\n 3. Show All Room " +
                    "\n 4. Show All Name Villa Not Duplicate " +
                    "\n 5, Show All Name House Not Duplicate " +
                    "\n 6. Show All Name Name Not Duplicate " +
                    "\n 7. Back To Menu " +
                    "\n 8. Exit ");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showAllService(VILLA);
                    isBackToMenu = false;
                    break;
                case 2:
                    showAllService(HOUSE);
                    isBackToMenu = false;

                    break;
                case 3:
                    showAllService(ROOM);
                    isBackToMenu = false;
                    break;
                case 4:
                    showAllServiceNotDup(VILLA);
                    isBackToMenu = true;
                    break;
                case 5:
                    showAllServiceNotDup(HOUSE);
                    isBackToMenu = true;
                    break;
                case 6:
                    showAllServiceNotDup(ROOM);
                    isBackToMenu = true;
                    break;
                case 7:
                    isBackToMenu = true;
                    break;
            }
            if (isBackToMenu) {
                return;
            }
        } while (choice >= 1 && choice <= 8);
    }

    public static List<Services> readAllServices(String fileName) {
        FileUtils.setFullPathFile(fileName);
        List<String> propertiesService = FileUtils.readFile();
        List<Services> servicesList = new ArrayList<>();
        String[] propetiesElement = null;

        Services services = null;
        FreeService freeService = null;

        for (String propeties : propertiesService) {
            propetiesElement = propeties.split(StringUtils.COMMA);

            if (fileName.equals(VILLA)) {
                services = new Villa();

                ((Villa) services).setRoomStandard(propetiesElement[6]);
                ((Villa) services).setOtherFacilities(propetiesElement[7]);
                ((Villa) services).setPoolArea(Double.parseDouble(propetiesElement[8]));
                ((Villa) services).setNumberOfFloor(Integer.parseInt(propetiesElement[9]));
            }

            else if (fileName.equals(HOUSE)) {
                services = new House();

                ((House) services).setRoomStandard(propetiesElement[6]);
                ((House) services).setOtherFacilities(propetiesElement[7]);
                ((House) services).setNumberOfFloor(Integer.parseInt(propetiesElement[8]));
            }

            else if (fileName.equals(ROOM)) {
                freeService = new FreeService(propetiesElement[6], propetiesElement[7],
                        Double.parseDouble(propetiesElement[8]));
                services = new Room();

                ((Room) services).setFreeServices(freeService);
            }


                services.setId(propetiesElement[0]);
                services.setNameService(propetiesElement[1]);
                services.setAreaUse(Double.parseDouble(propetiesElement[2]));
                services.setRetalCost(Double.parseDouble(propetiesElement[3]));
                services.setNumberOfPeople(Integer.parseInt(propetiesElement[4]));
                services.setRentalType(propetiesElement[5]);

                servicesList.add(services);

        }
        return servicesList;
    }

    private static void showAllService(String fileName) {
        System.out.println("------------------------------");
        System.out.println("******* List Service *********");
        for (Services services : readAllServices(fileName)) {
            services.showInfor();
        }
    }

    private static void showAllServiceNotDup(String fileName) {
        Set<String> setOfServices = new TreeSet<>();
        System.out.println("------------------------------");
        System.out.println("******* List Service Not Duplicate Name *********");
        for (Services o : readAllServices(fileName)) {
            setOfServices.add(o.getNameService());
        }

        for (String name : setOfServices) {
            System.out.println(name);
        }
    }


}

