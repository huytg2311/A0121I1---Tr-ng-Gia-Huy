package arraylistbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // tạo danh sách sẵn
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("Math", 2, 20.000, "MAE");
        Book book2 = new Book("Code Java", 4, 200.000, "MAE");
        Book book3 = new Book("Doremon", 3, 7.000, "Kim Dong");
        Book book4 = new Book("Love Life", 1, 350.000, "WAC");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        Main main = new Main();
//        main.priceOver10(books);
//        main.priceOver10NotOver20(books);
//        main.hideIn5(books);
//        main.addBook(books);
//        main.addIndex(books);
//        System.out.println("=======After change brand=======");
//        main.changeBrand(books);
//        main.deleteIndex(books);
//        int count = main.hideBrand(books);
//        System.out.println("MAE brand has " + count);
//        int coun1 = main.hideC(books);
//        System.out.println("List have name 'C': " + coun1);
//        main.sellBook(books);
//        main.sellBrand(books);
//        main.tangDan(books);
//        main.sapXepName(books);
//        main.sapXepPrice(books);

    }

    // hiển thị danh sách book
    public void display(ArrayList<Book> books) {
        for (Book o : books) {
            System.out.println(o);
        }
    }

    // hiển thị danh sách có giá lớn hơn 10
    public void priceOver10(ArrayList<Book> list) {
        int count = 0;
        for (Book o : list) {
            if (o.getPrice() > 10.000) {
                count++;
            }
        }
        System.out.println("Book number over 10.000VND : " + count);
    }

    // hiển thị danh sách lớn hơn 10 nhưng không quá 20
    public void priceOver10NotOver20(ArrayList<Book> list) {
        int count = 0;
        for (Book o : list) {
            if (o.getPrice() > 10.000 && o.getPrice() <= 20.000) {
                count++;
            }
        }
        System.out.println("Book number over 10 and not over 20: " + count);
    }

    // hiển thị thông tin book ở index 2
    public void hideIn5(ArrayList<Book> list) {
        //hiden index 2
        System.out.println(list.get(2));
    }

    // thêm 1 book vào trong danh sách
    public void addBook(ArrayList<Book> list) {
        Book book5 = new Book("Nha Gia Kim", 5, 78.000, "VietNam");
        list.add(book5);

        for (Book o : list) {
            System.out.println(o);
        }
    }

    // thêm 1 book vào vị trí thứ index
    public void addIndex(ArrayList<Book> list) {
        Book book2 = new Book("Naruto", 3, 15.000, "Japan");
        list.add(2, book2);

        for (Book o : list) {
            System.out.println(o);
        }
    }

    // thay đổi brand
    public void changeBrand(ArrayList<Book> list) {
        list.get(2).setBrand("J.P");
        System.out.println(list.get(2));
    }

    // xóa book ở vị trí số 3
    public void deleteIndex(ArrayList<Book> list) {
        list.remove(3);
        for (Book o : list) {
            System.out.println(o);
        }
    }

    // hiển thị các book có brand "MAE"
    public int hideBrand(ArrayList<Book> list) {
        int count = 0;
        for (Book o : list) {
            if (o.getBrand() == "MAE") {
                count++;
            }
        }
        return count;
    }

    // hiển thị các book có chữ L đầu tiên
    public int hideC(ArrayList<Book> list) {
        int count = 0;
        for (Book o : list) {
            if (o.getName().startsWith("L")) {
                count++;
            }
        }
        return count;
    }

    // giảm giá tất cả sách 10%
    public void sellBook(ArrayList<Book> list) {
        for (Book o : list) {
            double price = (o.getPrice() * 0.10);
            o.setPrice(o.getPrice());
        }

        for (Book o : list) {
            System.out.println(o);
        }
    }

    // brand MAE được giảm giá 10%
    public void sellBrand(ArrayList<Book> list) {
        for (Book o : list) {
            if (o.getBrand().equals("MAE")) {
                double price = (o.getPrice() * 0.10);
                o.setPrice(price);
            }
        }

        for (Book o : list) {
            System.out.println(o);
        }
    }

    // sắp xếp danh sach code tăng dần
    public void tangDan(ArrayList<Book> list) {
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getCode() - o2.getCode();
            }
        });

        for (Book o : list) {
            System.out.println(o);
        }
    }

    // sắp xếp danh sách theo name
    public void sapXepName(ArrayList<Book> list) {
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });

        for (Book o : list) {
            System.out.println(o);
        }
    }

    // sắp xếp theo giá
    public void sapXepPrice(ArrayList<Book> list) {
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (Book o : list) {
            System.out.println(o);
        }
    }
}
