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


     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author);
            }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author);
    }
    @Override
    public String toString() {
        return "Product{" +
                "author='" + author +
                '}';
    }

}
