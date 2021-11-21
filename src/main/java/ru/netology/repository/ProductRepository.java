package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository {
    private Product[] result = new Product[0];

    public void save(Product item) {
        int length = result.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(result, 0, tmp, 0, result.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        result = tmp;
    }

    public Product[] findAll() {
        return result;
    }

    public Product findById(int id) {
        for (Product item : result) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void removeById(int id) {
        int length = result.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item : result) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        result = tmp;
    }
}
