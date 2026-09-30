package org.ttw.decorator;

public class PaymentProcessLogger implements PaymentProcessor{
    private final PaymentProcessor paymentProcessor;
    public PaymentProcessLogger(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void process(String token, Float amount, boolean charged){
        System.out.println("before payment processing");
        paymentProcessor.process(token,amount,charged);
        System.out.println("after payment processing");
    }

}
