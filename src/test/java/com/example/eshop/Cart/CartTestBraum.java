package com.example.eshop.Cart;

import com.example.eshop.cart.Cart;
import com.example.eshop.cart.CartItem;
import com.example.eshop.product.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTestBraum {
        @Test
    public void addCartBraum(){
            Cart cart=new Cart();
            Product product=new Product("Kryl","jkskdjhsdkhsjkhsd",new BigDecimal(5000)) {
            };
            int quantity=20;

            cart.addItem(product,quantity);
            for (CartItem item : cart.getItems()) {

                Product actualProduct = item.getProduct();

                assertAll("Verify product attributes",
                        () -> assertEquals(product.getName(), actualProduct.getName(), "Product name should match"),
                        () -> assertEquals(product.getDescription(), actualProduct.getDescription(), "Product description should match"),
                        () -> assertEquals(product.getPrice(), actualProduct.getPrice(), "Product price should match"),
                        () -> assertEquals(quantity, item.getQuantity(), "Quantity should match")
                );
            }
        }

        @Test
    public void removeBraum(){
            Cart cart=new Cart();
            Product product=new Product("Kryl","jkskdjhsdkhsjkhsd",new BigDecimal(5000)) {
            };
            int quantity=20;

            cart.addItem(product,quantity);
            cart.removeItem(product);
        }

    @Test
    void shouldCalculateTotalCorrectly() {
        Cart cart = new Cart();

        Product product1 = new Product("Book", "Nice book", new BigDecimal("10.00")){};
        Product product2 = new Product("Pen", "Blue pen", new BigDecimal("5.00")){};

        cart.addItem(product1, 2); // 20.00
        cart.addItem(product2, 3); // 15.00

        BigDecimal total = cart.calculateTotal();

        assertEquals(new BigDecimal("35.00"), total);
    }
}
