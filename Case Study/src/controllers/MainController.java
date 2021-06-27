package controllers;

import commons.ConvertUtils;
import commons.FileUtils;
import commons.StringUtils;
import commons.Validators;
import exceptions.*;
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
    private static String CUSTOMER = "customer";
    private static String BOOKING = "booking";
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
                    addNewCustomer(CUSTOMER);
                    break;
                case 4:
                    showInformationOfCustomer(CUSTOMER);
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

    private static void addNewBoking() throws IOException {
        List<Customer> listOfCustomer = readAllCustomer(CUSTOMER);
        showInformationOfCustomer(CUSTOMER);
        System.out.println("Please choose customer to booking: ");
        int iCustomer = scanner.nextInt();
        System.out.println("1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n");
        System.out.println("Please choose type of service: ");
        int iTypeOfServices = scanner.nextInt();

        List<Services> listOfService = null;
        switch (iTypeOfServices) {
            case 1:
                listOfService = readAllServices(VILLA);
                showAllService(VILLA);
                break;
            case 2:
                listOfService = readAllServices(HOUSE);
                showAllService(HOUSE);
                break;
            case 3:
                listOfService = readAllServices(ROOM);
                showAllService(ROOM);
                break;
        }

        System.out.println("Please choose service to booking: ");
        int iServices = scanner.nextInt();

        Customer customer = listOfCustomer.get(iCustomer - 1);
        customer.setServices(listOfService.get(iServices - 1));

        FileUtils.setFullPathFile(BOOKING);
        FileUtils.writeFile(new String[] {customer.toString()});

        System.out.println("Booking is done");
    }

    private static List<Customer> readAllCustomer(String fileName) {
        FileUtils.setFullPathFile(fileName);
        List<String> propertiesCustomer = FileUtils.readFile();
        List<Customer> listOfCustomer = new ArrayList<>();
        String[] arrPropertyCustomer = null;
        Customer customer = null;

        for (String properties : propertiesCustomer) {
            arrPropertyCustomer = properties.split(StringUtils.COMMA);

            customer = new Customer();
            customer.setFullName(arrPropertyCustomer[0]);
            customer.setDate(arrPropertyCustomer[1]);
            customer.setGender(arrPropertyCustomer[2]);
            customer.setIdCard(arrPropertyCustomer[3]);
            customer.setPhoneNumber(arrPropertyCustomer[4]);
            customer.setEmail(arrPropertyCustomer[5]);
            customer.setTypeOfCustomer(arrPropertyCustomer[6]);
            customer.setAddress(arrPropertyCustomer[7]);

            listOfCustomer.add(customer);

        }
        Collections.sort(listOfCustomer);
        return listOfCustomer;
    }

    private static void showInformationOfCustomer(String fileName) {
        System.out.println("------- List Customer --------");

        List<Customer> listOfCustomer = readAllCustomer(fileName);

        Customer customer = null;
        for (int i = 0; i < listOfCustomer.size(); i++) {
            customer = listOfCustomer.get(i);
            System.out.println((i + 1) + ". ");
            customer.showInfor();
        }
    }

    private static void addNewCustomer(String fileName) throws IOException {
        scanner.nextLine();

        boolean flag;

        String fullName = null;
        do {
            flag = true;
            System.out.print("Enter Name: ");
            fullName = scanner.nextLine();
            try {
                Validators.isValidFullName(fullName);
            } catch (NameException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);

        String date = null;
        do {
            flag = true;
            System.out.print("Enter Date: ");
            date = scanner.nextLine();
            try {
                Validators.isValidBirthday(date);
            } catch (BirthdayException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);

        String gender = null;
        do {
            flag = true;
            System.out.print("Enter Gender: ");
            gender = scanner.nextLine();
            try {
                Validators.isValidGender(gender);
            } catch (GenderException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);
        gender = ConvertUtils.normalizeStr(gender);

        String idCard = null;
        do {
            flag = true;
            System.out.print("Enter CMND: ");
            idCard = scanner.nextLine();
            try {
                Validators.isValidIdCard(idCard);
            } catch (IdCardException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);
        System.out.print("Enter Phone Number: ");
        String phoneOfNumber = scanner.nextLine();


        String email = null;
        do {
            flag = true;
            System.out.print("Enter Email: ");
            email = scanner.nextLine();
            try {
                Validators.isValidEmail(email);
            } catch (EmailException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);

            System.out.print("Enter Type Of Customer: ");
            String typeOfCustomer = scanner.nextLine();

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            FileUtils.setFullPathFile(fileName);
            FileUtils.writeFile(new String[]{fullName, date, gender, idCard, phoneOfNumber,
                    email, typeOfCustomer, address});

        }


// Menu 1 : add --------------------------------------------
        public static void addNewServices () throws IOException {
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
        private static void addNewService (String fileName) throws IOException {
            scanner.nextLine();
            String id = null;
            do {
                System.out.print("Enter Id: ");
                id = scanner.nextLine();
            } while (!Validators.isValidRegex(id, Validators.SERVICE_CODE_REGEX));

            String nameService = null;
            do {
                System.out.print("Enter NameService: ");
                nameService = scanner.nextLine();
            } while (!Validators.isValidRegex(nameService, Validators.SERVICE_NAME_REGEX));

            double areaUse = 0;
            do {
                System.out.println("Enter Area Use: ");
                areaUse = scanner.nextDouble();
            } while (!Validators.isMoreThan(areaUse, 30));

            double retalCost = 0;
            do {
                System.out.print("Enter Retalcost: ");
                retalCost = scanner.nextDouble();
            } while (!Validators.isMoreThan(retalCost, 0));

            int numberOfPeople = 0;
            do {
                System.out.print("Enter number of people: ");
                numberOfPeople = scanner.nextInt();
            } while (!Validators.isMoreThan(numberOfPeople, 0, 20));

            scanner.nextLine();

            String rentalType = null;
            do {
                System.out.print("Enter Rental Type: ");
                rentalType = scanner.nextLine();
            } while (!Validators.isValidRegex(rentalType, Validators.SERVICE_NAME_REGEX));

            FileUtils.setFullPathFile(fileName);

            // Add Villa
            if (fileName.equals(VILLA)) {

                String roomStandard = null;
                do {
                    System.out.print("Enter Room Standard: ");
                    roomStandard = scanner.nextLine();
                } while (!Validators.isValidRegex(roomStandard, Validators.SERVICE_NAME_REGEX));
                System.out.println("Enter Other Facilities: ");
                String otherFacilities = scanner.nextLine();
                System.out.println("Enter Pool Area: ");
                double poolArea = scanner.nextDouble();

                int numberOfFloor = 0;
                do {
                    System.out.println("Enter Number Of Floor: ");
                    numberOfFloor = scanner.nextInt();
                } while (!Validators.isMoreThan(numberOfFloor, 0));

                // write villa to file
                FileUtils.writeFile(new String[]{id, nameService, roomStandard, String.valueOf(retalCost), String.valueOf(numberOfPeople), rentalType,
                        roomStandard, otherFacilities, String.valueOf(poolArea), String.valueOf(numberOfFloor)});
            }

            // Add House
            else if (fileName.equals(HOUSE)) {
                String roomStandard;
                do {
                    System.out.print("Enter Room Standard: ");
                    roomStandard = scanner.nextLine();
                } while (!Validators.isValidRegex(roomStandard, Validators.SERVICE_NAME_REGEX));
                System.out.println("Enter Other Facilities: ");
                String otherFacilities = scanner.nextLine();

                int numberOfFloor = 0;
                do {
                    System.out.println("Enter Number Of Floor: ");
                    numberOfFloor = scanner.nextInt();
                } while (!Validators.isMoreThan(numberOfFloor, 0));

                // write house to file
                FileUtils.writeFile(new String[]{id, nameService, roomStandard, String.valueOf(retalCost), String.valueOf(numberOfPeople), rentalType,
                        roomStandard, otherFacilities, String.valueOf(numberOfFloor)});
            }

            // Add Room
            else if (fileName.equals(ROOM)) {
                String freeServiceName = null;
                do {
                    System.out.println("Enter Free Service Name: ");
                    freeServiceName = scanner.nextLine();
                } while (!Validators.isValidFreeService(freeServiceName));

                System.out.println("Enter unit: ");
                String unit = scanner.nextLine();
                System.out.println("Enter money: ");
                double money = scanner.nextDouble();

                // write room to file
                FileUtils.writeFile(new String[]{freeServiceName, unit, String.valueOf(money)});
            }
        }
        //======================================================================================================

        private static void showServices () {
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
        // ----------------------------------------------------------------------

        // read file ------------------------------------------------------------
        public static List<Services> readAllServices (String fileName){
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
                } else if (fileName.equals(HOUSE)) {
                    services = new House();

                    ((House) services).setRoomStandard(propetiesElement[6]);
                    ((House) services).setOtherFacilities(propetiesElement[7]);
                    ((House) services).setNumberOfFloor(Integer.parseInt(propetiesElement[8]));
                } else if (fileName.equals(ROOM)) {
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
        //-----------------------------------------------------------------------------

        // Menu 2: show -----------------------------------------------------------
        private static void showAllService (String fileName){
            System.out.println("------------------------------");
            System.out.println("******* List Service *********");

            List<Services> servicesList = readAllServices(fileName);
            Services services = null;
            for (int i = 0; i < servicesList.size(); i++) {
                services = servicesList.get(i);
                System.out.println((i + 1) + ". ");
                services.showInfor();
            }
        }

        private static void showAllServiceNotDup (String fileName){
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
        //----------------------------------------------------------------------------------


    }

