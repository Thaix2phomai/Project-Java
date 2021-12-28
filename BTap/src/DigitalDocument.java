import java.time.LocalDate;
import java.util.Arrays;

public class DigitalDocument extends Library {
    private String director;
    private int releaseyear;
    private LocalDate uploadday;
    private double size;
    private int dowload;

    public DigitalDocument(int id, String name, String director, int releaseyear, LocalDate uploadday, String[] type, double size, int dowload) {
        super(id, name, type);
        this.director = director;
        this.releaseyear = releaseyear;
        this.uploadday = uploadday;
        this.size = size;
        this.dowload = dowload;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }

    public LocalDate getUploadday() {
        return uploadday;
    }

    public void setUploadday(LocalDate uploadday) {
        this.uploadday = uploadday;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getDowload() {
        return dowload;
    }

    public void setDowload(int dowload) {
        this.dowload = dowload;
    }

    @Override
    public String toString() {
        return super.toString()
                + " - " + "Tác giả=" + director
                + " - " + "Năm xuất bản=" + releaseyear
                + " - " + "Ngày đăng tải=" + uploadday
                + " - " + "Thể loại=" + Arrays.toString(super.getType())
                + " - " + "Dung lượng=" + size
                + " - " + "Lượt tải về=" + dowload
                ;
    }
}