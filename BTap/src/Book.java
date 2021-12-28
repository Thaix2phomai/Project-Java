import java.util.Arrays;

public class Book extends Library {
    private String director;
    private int releaseYear;
    private int page;
    private String officalCompany;
    private int number;


    public Book(int id, String name, String director, int releaseYear, String[] type, int page, String officalCompany, int number) {
        super(id, name, type);
        this.director = director;
        this.releaseYear = releaseYear;
        this.page = page;
        this.officalCompany = officalCompany;
        this.number = number;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getOfficalCompany() {
        return officalCompany;
    }

    public void setOfficalCompany(String officalCompany) {
        this.officalCompany = officalCompany;
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
                + " - " + "Tác giả=" + director
                + " - " + "Năm xuất bản=" + releaseYear
                + " - " + "Thể loại=" + Arrays.toString(super.getType())
                + " - " + "Số trang=" + page
                + " - " + "Nhà xuất bản=" + officalCompany
                + " - " + "Số lượng=" + number;
    }
}
