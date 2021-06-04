package product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    public static class Manager {
        private int id;
        private String name;
        private float money;

        public Manager() {
        }

        public Manager(int id, String name, float money) {
            this.id = id;
            this.name = name;
            this.money = money;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getMoney() {
            return money;
        }

        public void setMoney(float money) {
            this.money = money;
        }
    }
    public static void main(String[] args) {
        Manager m1 = new Manager(1,"Vô cực kiếm",2400);
        Manager m2 = new Manager(2,"Huyết kiếm", 3600);
        Manager m3 = new Manager(3,"Tam hợp kiếm",3100);
        Manager m4 = new Manager(4,"Song kiếm tai ương",4200);

        Product<Manager> managerProduct = new Product<>();
        Product<Manager> removeProduct = new Product<>();
        managerProduct.add(m1);
        managerProduct.add(m2);
        managerProduct.add(m3);
        managerProduct.add(m4);
        managerProduct.size();

        for (int i = 0; i < managerProduct.size(); i++) {
            Manager manager = (Manager) managerProduct.elements[i];
            System.out.println("Sản phẩm " + manager.getId() + " : ");
            System.out.println("Tên sản phẩm : " + manager.getName());
            System.out.println("Giá tiền : " + manager.getMoney());
        }

        Manager manager = removeProduct.remove(1);
    }
}
