package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Book;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class Service {
    public ArrayList<Book> getData() {
        ArrayList<Book> booksList = new ArrayList<>();
        Gson gson = new Gson();
        try {
            FileReader reader = new FileReader("Book.json");
            Type objectType = new TypeToken<ArrayList<Book>>() {
            }.getType();
            booksList = gson.fromJson(reader, objectType);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return booksList;
    }

    public void printBooks(ArrayList<Book> booksList) {
        for (Book book : booksList) {
            System.out.println(book);
        }
    }

    public void printByCategory(ArrayList<Book> bookslist) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thể loại bạn muốn tìm kiếm: ");
        int count = 0;
        String category = sc.nextLine();
        for (int i = 0; i < bookslist.size(); i++) {
            for (int j = 0; j < bookslist.get(i).getCategory().length; j++) {
                if (bookslist.get(i).getCategory()[j].toLowerCase().contains(category.toLowerCase())) {
                    System.out.println(bookslist.get(i));
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Không có thể loại bạn muốn tìm kiếm !!!");
        }
    }

    public Map<String, Integer> countByCategory(ArrayList<Book> bookslist) {
        Map<String, Integer> categoryMap = new HashMap<>();
        for (Book book : bookslist) {
            String[] category = book.getCategory();
            for (int i = 0; i < category.length; i++) {
                if (categoryMap.get(category[i]) == null) {
                    categoryMap.put(category[i], 1);
                } else {
                    categoryMap.put(category[i], categoryMap.get(category[i]) + 1);
                }
            }
        }
        return categoryMap;
    }


    public void printByYear(ArrayList<Book> booksList) {
        Collections.sort(booksList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPulishingYear() - o1.getPulishingYear();
            }
        });
        printBooks(booksList);
    }


    public void printByName(ArrayList<Book> bookslist) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sách bạn muốn tìm kiếm: ");
        int count = 0;
        String title = sc.nextLine();
        for (int i = 0; i < bookslist.size(); i++) {
            if (bookslist.get(i).getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(bookslist.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có sách bạn muốn tìm kiếm !!!");
        }
    }

}