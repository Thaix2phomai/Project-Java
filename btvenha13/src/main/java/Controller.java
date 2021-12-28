import model.Book;
import service.Service;

import java.util.ArrayList;
import java.util.Map;

public class Controller {
    Service service;
    ArrayList<Book> bookslist;

    public Controller() {
        service = new Service();
        bookslist = service.getData();
    }

    public void mainMenu() {
        boolean isCheck = false;
        while (!isCheck) {
            menu();
            int choice = CheckInPut.input();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách toàn bộ Sách: ");
                    service.printBooks(bookslist);
                    break;
                case 2:
                    service.printByCategory(bookslist);
                    break;
                case 3:
                    Map<String, Integer> countByCategory = service.countByCategory(bookslist);
                    System.out.println("Số lượng sách mỗi thể loại : ");
                    for (Map.Entry<String, Integer> entry : countByCategory.entrySet()) {
                        System.out.println("Thể loại " + entry.getKey() + " : " + entry.getValue() + " cuốn");
                    }
                    break;
                case 4:
                    System.out.println("Sách theo năm xuất bản gần đây nhất: ");
                    service.printByYear(bookslist);
                    break;
                case 5:
                    service.printByName(bookslist);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này !!!");
            }
        }
    }
    public static void menu() {
        System.out.println("1 - Danh sách toàn bộ Sách");
        System.out.println("2 - Lọc sách theo thể loại");
        System.out.println("3 - Đếm sách theo thể loại");
        System.out.println("4 - Sắp xếp sách theo năm xuất bản");
        System.out.println("5 - Tìm sách theo tên");
        System.out.println("0 - Thoát chương trình");
    }
}
