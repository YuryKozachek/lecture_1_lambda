package ru.netology;

import ru.netology.product.Product;
import ru.netology.service.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();

        service.addProd(new Product(11,20_000,2));
        service.addProd(new Product(12,24_000,2));
        service.addProd(new Product(15,50_000,3));
        service.addProd(new Product(18,10_000,1));
        service.addProd(new Product(10,230_000,5));

        System.out.println(service.sortBy((o1, o2) -> o1.getPrice() - o2.getPrice()));
    }

}
