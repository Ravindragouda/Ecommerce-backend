package com.example.Ecommerce.Repo;

import com.example.Ecommerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
