package com.example.springboot_app;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    @PostConstruct
    public void init(){
        products.addAll(Arrays.asList(
                new Product(1, "Яблоко",50),
                new Product(2, "Молоко", 70),
                new Product(3, "Яйца", 90),
                new Product(4, "Хлеб", 30),
                new Product(5, "Масло", 180)
        ));
    }

    public void save(Product product){
        products.add(product);
    }

    public List<Product> findAll(){
        return Collections.unmodifiableList(products);
    }

    public Product findById(int id){
        return products.get(id);
    }

    public void add(Product product){
        products.add(product);

    }


}
