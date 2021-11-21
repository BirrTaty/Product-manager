package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;
import ru.netology.domain.Book;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductManagerTest {

    private Book first = new Book(1,"Castle",100,"Kafka");

    @Test
    public void shouldSearch(){
        ProductManager productManager = new ProductManager();

        productManager.add(first);

        Product[] actual = productManager.searchBy( "Kafka");
        Product[] expected = new Product[]{first};

        assertArrayEquals(expected, actual);


    }

}