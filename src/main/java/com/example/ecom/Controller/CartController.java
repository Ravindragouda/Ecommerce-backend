package com.example.ecom.Controller;

import com.example.ecom.Entity.Cart;
import com.example.ecom.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;
    // Create a new cart
    @PostMapping("/create")
    public Cart createCart() {
        return cartService.createCart();
    }

    // Add item to cart
    @PostMapping("/{cartId}/add")
    public Cart addItemToCart(@PathVariable Long cartId, @RequestParam Long productId, @RequestParam int quantity) {
        return cartService.addItemToCart(cartId, productId, quantity);
    }

    // Remove item from cart
    @DeleteMapping("/{cartId}/remove/{itemId}")
    public Cart removeItemFromCart(@PathVariable Long cartId, @PathVariable Long itemId) {
        return cartService.removeItemFromCart(cartId, itemId);
    }

    // Update cart item quantity
    @PutMapping("/{cartId}/update/{itemId}")
    public Cart updateItemQuantity(@PathVariable Long cartId, @PathVariable Long itemId, @RequestParam int quantity) {
        return cartService.updateItemQuantity(cartId, itemId, quantity);
    }

    // View cart
    @GetMapping("/{cartId}")
    public Cart viewCart(@PathVariable Long cartId) {
        return cartService.viewCart(cartId);
    }
}
