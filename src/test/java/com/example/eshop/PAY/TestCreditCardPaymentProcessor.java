package com.example.eshop.PAY;

import com.example.eshop.payment.CreditCardPaymentProcessor;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class TestCreditCardPaymentProcessor {
    @Test
    void newCreditCardPaymentProcessor()
    {
        BigDecimal amount = new BigDecimal(69);
        CreditCardPaymentProcessor processor = new CreditCardPaymentProcessor();
        processor.processPayment(amount);
    }
}
