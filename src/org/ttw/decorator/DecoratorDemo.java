package org.ttw.decorator;

public class DecoratorDemo {

    public static void main(String[] args){
        PaymentProcessor paymentProcessor = new CBPaymentProcessor();
        PaymentProcessor logger = new PaymentProcessLogger(paymentProcessor);
        logger.process();
    }
}
