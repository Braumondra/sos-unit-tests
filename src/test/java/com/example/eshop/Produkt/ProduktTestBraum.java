package com.example.eshop.Produkt;

import com.example.eshop.product.DigitalProduct;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProduktTestBraum {
    @Test
    void createNewDigitalProductBraum(){
        String name="fas";
        String description="";
        BigDecimal price=new BigDecimal(10);
        String url ="https://seznam.cz";

        DigitalProduct product=new DigitalProduct(name,description,price,url);

        assertAll("Verify product attributies",
                () -> assertEquals(name,product.getName(),"Name shouldmatch"),
                () -> assertEquals(description,product.getDescription(),"Name should match"),
                () -> assertEquals(price,product.getPrice(),"Name shouldmatch"),
                () -> assertEquals(url,product.getDownloadUrl(),"Name shouldmatch"));
    }

    @Test
    void setProducturlBraum(){
        String name="fas";
        String description="";
        BigDecimal price=new BigDecimal(10);
        String url ="https://seznam.cz";

        DigitalProduct product=new DigitalProduct(name,description,price,url);
        url="https://sez25nam.cz";
        product.setDownloadUrl(url);
    }


}
