package ru.netology.service;

import ru.netology.product.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ProductService {
    private final List<Product> products = new ArrayList<>();

    //добавление продукта
    public void addProd(Product product) {
        products.add(product);
    }

    // выдает отсортированный список, того что лежит в корзине по критерию
    public List<Product> sortBy(Comparator<Product> comparator) {
        List<Product> result = new LinkedList<>(products);
        result.sort(comparator);
        return result;
    }

}
