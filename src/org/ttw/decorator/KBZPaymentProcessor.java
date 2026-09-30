package org.ttw.decorator;

public class KBZPaymentProcessor implements PaymentProcessor{
    @Override
    public void process() {
        System.out.println(" kbz payment processing");
    }
}
