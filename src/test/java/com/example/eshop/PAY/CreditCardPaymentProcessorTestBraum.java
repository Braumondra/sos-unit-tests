package com.example.eshop.PAY;

import com.example.eshop.payment.CreditCardPaymentProcessor;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CreditCardPaymentProcessorTestBraum {
    @Test
    void newCreditCardPaymentProcessorBraum()
    {
        BigDecimal amount = new BigDecimal(69);
        CreditCardPaymentProcessor processor = new CreditCardPaymentProcessor();
        processor.processPayment(amount);
    }
}
