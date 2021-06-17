package arraylistbook;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("Math", 1, 20.000, "MAE");
        Book book2 = new Book("Code Java", 2, 200.000, "HLC");
        Book book3 = new Book("Doremon", 3, 7.000, "Kim Dong");
        Book book4 = new Book("Love Life", 4, 350.000, "WAC");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        Main main = new Main();
        main.priceOver10(books);
        main.priceOver10NotOver20(books);
        main.hideIn5(books);


    }

    public void display(ArrayList<Book> books) {
        for (Book o : books) {
            System.out.println(o);
        }
    }

    public void priceOver10(ArrayList<Book> list) {
        int count = 0;
        for (Book o : list) {
            if (o.getPrice() > 10.000) {
                count++;
            }
        }
        System.out.println("Book number over 10.000VND : " + count);
    }

    public void priceOver10NotOver20(ArrayList<Book> list) {
        int count = 0;
        for (Book o : list) {
            if (o.getPrice() > 10.000 && o.getPrice() <= 20.000) {
                count++;
            }
        }
        System.out.println("Book number over 10 and not over 20: " + count);
    }

    public void hideIn5(ArrayList<Book> list) {
        //hiden index 2
        System.out.println(list.get(2));
    }
}
