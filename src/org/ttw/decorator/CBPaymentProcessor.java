package org.ttw.decorator;

public class CBPaymentProcessor implements PaymentProcessor{
    @Override
    public void process() {
        System.out.println("CB payment Processing");
    }
}
