package org.ttw.decorator;

public class KBZPaymentProcessor implements PaymentProcessor{
    @Override
    public void process(String token, Float amount, boolean charged) {
        System.out.println(" kbz payment processing");
    }
}
