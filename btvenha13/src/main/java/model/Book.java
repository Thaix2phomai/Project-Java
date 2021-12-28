package model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("author")
    private String author;
    @SerializedName("category")
    private String [] category;
    @SerializedName("publishingYear")
    private int pulishingYear;
    @SerializedName("publishingCompany")
    private String pulishingCompany;
    @SerializedName("pageNumber")
    private int pageNumber;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category=" + Arrays.toString(category) +
                ", pulishingYear=" + pulishingYear +
                ", pulishingCompany='" + pulishingCompany + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
