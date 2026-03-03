package com.example.eshop.Cart;

import com.example.eshop.cart.CartItem;
import com.example.eshop.product.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartItemTestBraum {


    @Test
    public void newCartItemBraum(){
        String name="Karel";
        String description="nevim";
        BigDecimal price=new BigDecimal(100);
         int quantity= 10;
         BigDecimal celkem=price.multiply(BigDecimal.valueOf(quantity));

        CartItem cartItem=new CartItem(new Product(name,description,price) {
        }, quantity);

        assertAll("Verify product attributies",
                () -> assertEquals(name,cartItem.getProduct().getName(),"Name shouldmatch"),
                () -> assertEquals(description,cartItem.getProduct().getDescription(),"Name should match"),
                () -> assertEquals(price,cartItem.getProduct().getPrice(),"Name shouldmatch"),
                () -> assertEquals(quantity,cartItem.getQuantity(),"Name shouldmatch"),
                () -> assertEquals(celkem,cartItem.getTotalPrice(),"Name shoukdmatch"));
    }

    @Test
    public void setQuantityBraum(){
        String name="Karel";
        String description="nevim";
        BigDecimal price=new BigDecimal(100);
        int quantity= 10;

        CartItem cartItem=new CartItem(new Product(name,description,price) {
        }, quantity);

        quantity=20;
        BigDecimal celkem=price.multiply(BigDecimal.valueOf(quantity));
        cartItem.setQuantity(quantity);
    }

}
