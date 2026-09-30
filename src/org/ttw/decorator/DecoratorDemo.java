package org.ttw.decorator;

public class DecoratorDemo {

    public static void main(String[] args){
        PaymentProcessor paymentProcessor = new CBPaymentProcessor();
        PaymentProcessor retryPaymentProcessor = new RetryPaymentProcessor(paymentProcessor);
        PaymentProcessor logger = new PaymentProcessLogger(retryPaymentProcessor);
        logger.process();
    }
}
