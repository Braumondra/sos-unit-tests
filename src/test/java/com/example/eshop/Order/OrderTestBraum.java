package com.example.eshop.Order;

import com.example.eshop.cart.Cart;
import com.example.eshop.order.Order;
import com.example.eshop.order.OrderStatus;
import com.example.eshop.product.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTestBraum {

    @Test
    void shouldCreateOrderFromCartBraum() {
        Cart cart = new Cart();

        Product product = new Product("Book", "Nice book", new BigDecimal("10.00")){};
        cart.addItem(product, 2);

        Order order = new Order(cart);

        assertAll("Verify order creation",
                () -> assertNotNull(order.getId()),
                () -> assertEquals(1, order.getItems().size()),
                () -> assertEquals(new BigDecimal("20.00"), order.getTotalAmount()),
                () -> assertEquals(OrderStatus.PENDING, order.getStatus()),
                () -> assertNotNull(order.getOrderDate())
        );
    }
}
