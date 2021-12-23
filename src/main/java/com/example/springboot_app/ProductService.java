package com.example.springboot_app;

import org.springframework.stereotype.Service;//
import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public void save(Product product){
         productRepository.save(product);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(int id){ return productRepository.findById(id); }

    public void add(Product product){ productRepository.add(product); }


}
