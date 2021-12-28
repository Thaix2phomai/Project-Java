import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Magazine extends Library {
    private String editorial;
    private LocalDate date;
    private int page;
    private int number;

    public Magazine(int id, String name, String editorial, LocalDate date, String[] type, int page, int number) {
        super(id, name, type);
        this.editorial = editorial;
        this.date = date;
        this.page = page;
        this.number = number;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return super.toString()
                + " - " + "Tòa soạn=" + editorial
                + " - " + "Ngày xuất bản=" + date
                + " - " + "Thể loại=" + Arrays.toString(super.getType())
                + " - " + "Số trang=" + page
                + " - " + "Số lượng" + number;
    }
}
