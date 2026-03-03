package com.example.eshop.Order;

import com.example.eshop.cart.Cart;
import com.example.eshop.order.Order;
import com.example.eshop.order.OrderService;
import com.example.eshop.order.OrderStatus;
import com.example.eshop.payment.PaymentProcessor;
import com.example.eshop.product.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import java.math.BigDecimal;

public class OrderServiceTestBraum {
    @Test
    void shouldSetOrderToPaidWhenPaymentSucceedsBraum() {
        PaymentProcessor paymentProcessor = amount -> true;

        OrderService orderService = new OrderService(paymentProcessor);

        Cart cart = new Cart();
        cart.addItem(new Product("Book", "Nice", new BigDecimal("10")) {
        }, 2);

        Order order = orderService.placeOrder(cart);

        assertEquals(OrderStatus.PAID, order.getStatus());
        assertTrue(cart.getItems().isEmpty());
        assertEquals(new BigDecimal("20"), order.getTotalAmount());
    }

    @Test
    void shouldCancelOrderWhenPaymentFailsBraum() {
        PaymentProcessor paymentProcessor = amount -> false;

        OrderService orderService = new OrderService(paymentProcessor);

        Cart cart = new Cart();
        cart.addItem(new Product("Book", "Nice", new BigDecimal("10")){}, 1);

        Order order = orderService.placeOrder(cart);

        assertEquals(OrderStatus.CANCELLED, order.getStatus());
        assertTrue(cart.getItems().isEmpty());
    }

    @Test
    void shouldThrowExceptionWhenCartIsEmptyBraum() {
        PaymentProcessor paymentProcessor = amount -> true;
        OrderService orderService = new OrderService(paymentProcessor);

        Cart emptyCart = new Cart();

        assertThrows(IllegalStateException.class,
                () -> orderService.placeOrder(emptyCart));
    }
}
