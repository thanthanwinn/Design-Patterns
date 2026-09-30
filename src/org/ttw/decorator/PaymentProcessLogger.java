package org.ttw.decorator;

public class PaymentProcessLogger implements PaymentProcessor{
    private final PaymentProcessor paymentProcessor;
    public PaymentProcessLogger(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void process(){
        System.out.println("before payment processing");
        paymentProcessor.process();
        System.out.println("after payment processing");
    }

}
