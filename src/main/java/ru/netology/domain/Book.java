package ru.netology.domain;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)


public class Book extends Product {
    private String author;


    public Book(int id, String name, int price, String author, int pages, int publishedYear) {
        super(id, name, price);
        this.author = author;

    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
            }*/

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author +
                '}';
    }
}
