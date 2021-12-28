import java.time.LocalDate;
import java.util.*;

public class Service {
    public ArrayList<Book> addBook() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "Làm chủ lập trình", "Thái", 2021, new String[]{"Khoa học, Viễn tưởng "}, 200, "Kim Đồng", 2000));
        bookList.add(new Book(2, "Làm chủ Toán", "Cường", 2022, new String[]{"Khoa học, Logic "}, 250, "Thanh niên", 2000));
        bookList.add(new Book(3, "Làm chủ Văn", "Khải", 2021, new String[]{"Văn học "}, 220, "Thiếu nữ ", 2000));
        bookList.add(new Book(4, "Làm chủ Tiếng Anh", "Nam", 2023, new String[]{"Ngoại ngữ"}, 240, "Thời đại ", 2000));
        bookList.add(new Book(5, "Làm chủ Lịch sử", "Tuấn", 2019, new String[]{"Lịch sử"}, 221, "Tuổi thơ", 2000));

        return bookList;
    }

    public ArrayList<Magazine> addMagazine() {
        ArrayList<Magazine> magazineList = new ArrayList<>();
        magazineList.add(new Magazine(6, "Người đẹp", "a", LocalDate.of(2021, 6, 22), new String[]{"Khoa học"}, 200, 1000));
        magazineList.add(new Magazine(7, "Thể thao", "b", LocalDate.of(2021, 7, 20), new String[]{"Thể thao"}, 250, 2000));
        magazineList.add(new Magazine(8, "Công an", "c", LocalDate.of(2019, 5, 22), new String[]{"Lịch sử, Ngoại ngữ"}, 240, 1500));
        magazineList.add(new Magazine(9, "Đua xe", "d", LocalDate.of(2021, 9, 21), new String[]{"Thể thao"}, 230, 1800));
        magazineList.add(new Magazine(10, "Game", "e", LocalDate.of(2018, 8, 22), new String[]{"Thể thao, điện tử"}, 300, 3000));
        return magazineList;
    }

    public ArrayList<DigitalDocument> addDigitalDocument() {
        ArrayList<DigitalDocument> digitalDocumentList = new ArrayList<>();
        digitalDocumentList.add(new DigitalDocument(11, "a", "John", 2021, LocalDate.of(2021, 6, 22), new String[]{"Thể thao", "Khoa học"}, 33.33, 1000));
        digitalDocumentList.add(new DigitalDocument(12, "b", "Mike", 2020, LocalDate.of(2019, 7, 23), new String[]{"Đời sống", "Thời trang"}, 40.34, 2000));
        digitalDocumentList.add(new DigitalDocument(13, "c", "David", 2019, LocalDate.of(2018, 8, 19), new String[]{"Thời trang", "Lịch sử"}, 20.33, 3000));
        digitalDocumentList.add(new DigitalDocument(14, "d", "Tom", 2018, LocalDate.of(2021, 9, 15), new String[]{"Pháp luật"}, 33.65, 2500));
        digitalDocumentList.add(new DigitalDocument(15, "e", "Ally", 2021, LocalDate.of(2017, 10, 9), new String[]{"Người mẫu", "Thời trang"}, 17.33, 1100));
        digitalDocumentList.add(new DigitalDocument(16, "f", "Mings", 2017, LocalDate.of(2021, 12, 18), new String[]{"Sắc đẹp", "Đời sống"}, 49.26, 1230));
        digitalDocumentList.add(new DigitalDocument(17, "g", "Karl", 2021, LocalDate.of(2021, 4, 18), new String[]{"Chính trị", "Thế giới"}, 49.26, 1520));
        return digitalDocumentList;
    }

    public void printbook(ArrayList<Book> bookList) {
        System.out.println("Danh sách sách: ");
        bookList.forEach(book -> System.out.println(book));
    }

    public void printMagazine(ArrayList<Magazine> magazineList) {
        System.out.println("Danh sách tạp chí: ");
        magazineList.forEach(magazine -> System.out.println(magazine));
    }


    public void printDocument(ArrayList<DigitalDocument> documentList) {
        System.out.println("Danh sách eBook: ");
        documentList.forEach(document -> System.out.println(document));
    }

    public void findByType(ArrayList<Library> booklist) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập thể loại cần tìm : ");
        String type1 = sc.nextLine();
        System.out.println("Danh sách: ");
        int count1 = 0;
        booklist.stream()
                .filter(i -> (Arrays.toString(i.getType()).toLowerCase().contains(type1.toLowerCase())))
                .forEach(i -> System.out.println(i));
        booklist.stream()
                .filter(i -> (Arrays.toString(i.getType()).toLowerCase().contains(type1.toLowerCase())))
                .count();
        if (count1 == 0) {
            System.out.println("Không có sách cần tìm!!!");
        }
    }



    public void sortByDowload(ArrayList<DigitalDocument> documentList) {
        Collections.sort(documentList, new Comparator<DigitalDocument>() {
            @Override
            public int compare(DigitalDocument o1, DigitalDocument o2) {
                return o2.getDowload() - o1.getDowload();
            }
        });
        for (int i = 0; i < 5; i++) {
            System.out.println(documentList.get(i));
        }
    }

    public void getCurrentYear(ArrayList<Magazine> magazineList) {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        magazineList.stream().filter(magazine -> magazine.getDate().getYear() == year).forEach(System.out::println);
        long count = magazineList.stream().filter(magazine -> magazine.getDate().getYear() == year).count();
        if (count == 0) {
            System.out.println("Không có tạp chí năm hiện tại");
        }
    }

}
