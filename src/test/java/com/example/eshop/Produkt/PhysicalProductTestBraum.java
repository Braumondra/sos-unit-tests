package com.example.eshop.Produkt;

import com.example.eshop.product.PhysicalProduct;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PhysicalProductTestBraum {
    @Test
    void createNewDigitalProductBraum(){
               String name=" Karel";
               String description="nevim";
               BigDecimal price=new BigDecimal(10);
               double weight=10;
               BigDecimal shippingCost=new BigDecimal(69);

        PhysicalProduct product=new PhysicalProduct(name,description,price,weight,shippingCost);

        assertAll("Verify product attributies",
                () -> assertEquals(name,product.getName(),"Name shouldmatch"),
                () -> assertEquals(description,product.getDescription(),"Name should match"),
                () -> assertEquals(price,product.getPrice(),"Name shouldmatch"),
                () -> assertEquals(weight,product.getWeight(),"Name shouldmatch"),
                () -> assertEquals(shippingCost,product.getShippingCost(),"Name shouldmatch"));

    }
    @Test
    void setWeightBraum() {
        String name = " Karel";
        String description = "nevim";
        BigDecimal price = new BigDecimal(10);
        double weight = 10;
        BigDecimal shippingCost = new BigDecimal(69);

        PhysicalProduct product = new PhysicalProduct(name, description, price, weight, shippingCost);
        product.setWeight(weight);
    }

    @Test
    void setShippingCostBraum() {
        String name = "Karel";
        String description = "nevim";
        BigDecimal price = new BigDecimal(10);
        double weight = 10;
        BigDecimal shippingCost = new BigDecimal(69);
        PhysicalProduct product = new PhysicalProduct(name, description, price, weight, shippingCost);
        product.setShippingCost(shippingCost);
    }


}
