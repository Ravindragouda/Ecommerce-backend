package com.example.Ecommerce.Controller;

import com.example.Ecommerce.Model.Product;
import com.example.Ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id){
        return productService.getProductById(id);
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
