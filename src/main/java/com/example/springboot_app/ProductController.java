package com.example.springboot_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/products")

public class ProductController {
    private ProductService productService;

    public void ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        model.addAttribute("frontProducts", productService.findAll());
        return "all_products";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Product product){
        productService.add(product);
        return "redirect:/products/all";
    }



}