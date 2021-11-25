package ru.netology.manager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;
import ru.netology.domain.Book;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductManagerTest {
    ProductManager productManager = new ProductManager();

    private Book first = new Book(1, "Castle", 100, "Kafka");
    private Book second = new Book(2, "Lolita", 100, "Nabokov");
    private Book third = new Book(3, "Vanity Fair", 100, "Thackeray");
    private Book fourth = new Book(4, "War and Peace", 100, "Tolstoy");
    private Book fifth = new Book(5, "Ruslan and Ludmila", 100, "Pushkin");

    private Smartphone sixth = new Smartphone(6, "Galaxy Z", 100, "Samsung");
    private Smartphone seventh = new Smartphone(7, "33 10", 100, "Nokia");
    private Smartphone eighth = new Smartphone(8, "C55", 100, "Siemens");
    private Smartphone ninth = new Smartphone(9, "Razr", 100, "Motorola");
    private Smartphone tenth = new Smartphone(10, "IPhone 13", 100, "Apple");
    private Smartphone eleventh = new Smartphone(11, "Galaxy ZF", 100, "Samsung");

    @BeforeEach
    public void setUp() {

        productManager.add(first);
        productManager.add(second);
        productManager.add(third);
        productManager.add(fourth);
        productManager.add(fifth);
        productManager.add(sixth);
        productManager.add(seventh);
        productManager.add(eighth);
        productManager.add(ninth);
        productManager.add(tenth);
        productManager.add(eleventh);

    }

    @Test
    public void shouldSearchBookByAuthor() {
        String textForSearch = "Kafka";

        Product[] actual = productManager.searchBy(textForSearch);
        Product[] expected = new Product[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBookByName() {
        String textForSearch = "Lolita";

        Product[] actual = productManager.searchBy(textForSearch);
        Product[] expected = new Product[]{second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchSmartphoneByName() {
        String textForSearch = "IPhone 13";

        Product[] actual = productManager.searchBy(textForSearch);
        Product[] expected = new Product[]{tenth};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchSmartphoneByManufacturer() {
        String textForSearch = "Nokia";

        Product[] actual = productManager.searchBy(textForSearch);
        Product[] expected = new Product[]{seventh};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByErrorItem() {
        String textForSearch = "Camcung";

        Product[] actual = productManager.searchBy(textForSearch);
        Product[] expected = new Product[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchTwoProducts() {
        String textForSearch = "Samsung";

        Product[] actual = productManager.searchBy(textForSearch);
        Product[] expected = new Product[]{sixth, eleventh};

        assertArrayEquals(expected, actual);
    }

}