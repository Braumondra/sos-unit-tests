package com.example.eshop.Cart;

import com.example.eshop.cart.Cart;
import com.example.eshop.product.Product;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrickyTestBraum {

    @ParameterizedTest
    @CsvSource({
            "10.00, 2, 5.00, 3, 35.00",
            "100.00, 1, 50.00, 2, 200.00",
            "0.00, 5, 10.00, 1, 10.00"
    })
    void shouldCalculateTotalCorrectlyBraum(String price1, int qty1,
                                       String price2, int qty2,
                                       String expectedTotal) {

        Cart cart = new Cart();

        Product p1 = new Product("P1", "desc", new BigDecimal(price1)) {};
        Product p2 = new Product("P2", "desc", new BigDecimal(price2)) {};

        cart.addItem(p1, qty1);
        cart.addItem(p2, qty2);

        BigDecimal total = cart.calculateTotal();

        assertEquals(new BigDecimal(expectedTotal), total);
    }
}
