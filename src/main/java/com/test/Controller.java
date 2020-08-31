package com.test;

import com.test.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final ProductRepository productRepository;

    @Autowired
    public Controller(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/test/{userId}")
    public void test(@PathVariable Long userId) {
        List<Product> products = productRepository.getProducts(userId);
        products.forEach(product -> System.out.println(product.getUserProducts().size()));
    }
}
