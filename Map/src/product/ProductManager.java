package product;

import java.util.*;

public class ProductManager {
    static List<Product> productList;
    static Scanner scanner = new Scanner(System.in);

    static {
        productList = new ArrayList<>();
        productList.add(new Product(1, "Iphone", 23.000, "USA"));
        productList.add(new Product(2, "Samsung", 50.000, "Korean"));
        productList.add(new Product(3, "Oppo", 20.000, "China"));
        productList.add(new Product(4, "Nokia", 10.000, "VN"));
    }

    public static void menu() {
        int choice = -1;
        do {
            System.out.println("Enter choice: ");
            System.out.println("1. Show all product");
            System.out.println("2. Add new product");
            System.out.println("3. Edit product");
            System.out.println("4. Search product");
            System.out.println("5. Delete product");
            System.out.println("6. Exit");
            choice = scanner.nextInt();
            scanner.skip("\\R");
            switch (choice) {
                case 1:
                    displayAllProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    searchProduct();
                    break;
                case 5:
                    deleteProductById();
                case 6:
                    System.exit(0);
            }
        } while (true);
    }

    public static void displayAllProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static void addProduct() {
        int id = -1;
        if (productList.isEmpty()) {
            id = 1;
        } else {
            id = productList.get(productList.size() - 1).getId() + 1;
        }
        System.out.print("Enter name product: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double prince = scanner.nextDouble();
        scanner.skip("\\R");
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        Product product = new Product(id, name, prince, description);
        productList.add(product);
    }

    public static void deleteProductById() {
        System.out.print("Enter id product: ");
        int id = scanner.nextInt();
        scanner.skip("\\R");
        if (productList.isEmpty()) {
            id = -1;
        } else {
            for (int i = 0; i < productList.size(); i++) {
                if (id == productList.get(i).getId()) {
                    productList.remove(i);
                    break;
                }
            }
        }
    }

    public static void editProduct() {
        System.out.print("Enter id product: ");
        int id = scanner.nextInt();
        scanner.skip("\\R");
        int choice = -1;
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                System.out.println("Enter property edit: ");
                System.out.println("1. Name");
                System.out.println("2. Price");
                System.out.println("3.Description");
                System.out.println("4. Back to menu");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.skip("\\R");
                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        productList.get(i).setName(name);
                        break;
                    case 2:
                        System.out.print("Enter price: ");
                        double prince = scanner.nextDouble();
                        productList.get(i).setPrince(prince);
                        break;
                    case 3:
                        System.out.print("Enter description: ");
                        String description = scanner.nextLine();
                        productList.get(i).setDescription(description);
                    case 4:
                        menu();
                    default:
                        System.out.println("Please enter number in list !");
                }

            }
        }

    }

    public static void searchProduct() {
        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        scanner.skip("\\R");
        if (productList.isEmpty()) {
            System.out.println("Not valid !");
        } else {
            for (int i = 0; i < productList.size(); i++) {
                if (id == productList.get(i).getId()) {
                    System.out.println(productList.get(i));
                }
            }
        }
    }

    public static void sortProduct(int id) {


        }
    }


