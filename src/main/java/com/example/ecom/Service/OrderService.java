package com.example.ecom.Service;

import com.example.ecom.Entity.Cart;
import com.example.ecom.Entity.CartItem;
import com.example.ecom.Entity.Product;
import com.example.ecom.Repo.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public synchronized void placeOrder(Cart cart) {
        for (CartItem item : cart.getItems()) {
            Product product = item.getProduct();
            if (product.getInventory().getStockQuantity() >= item.getQuantity()) {
                product.getInventory().setStockQuantity(product.getInventory().getStockQuantity() - item.getQuantity());
                productRepository.save(product);
            } else {
                throw new RuntimeException("Stock not sufficient for product: " + product.getName());
            }
        }
    }
}
