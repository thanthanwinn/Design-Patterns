package org.ttw.decorator;

import org.ttw.decorator.adaptorTest.CardChangeGatewayAdaptor;
import org.ttw.decorator.adaptorTest.CardChargeGateway;

public class DecoratorDemo {

    public static void main(String[] args){
        PaymentProcessor paymentProcessor = new CBPaymentProcessor();
        CardChargeGateway cardChargeGateway = new CardChargeGateway();
        PaymentProcessor cardChangeGatewayAdaptor = new CardChangeGatewayAdaptor(cardChargeGateway,paymentProcessor);
        PaymentProcessor retryPaymentProcessor = new RetryPaymentProcessor(cardChangeGatewayAdaptor);
        PaymentProcessor logger = new PaymentProcessLogger(retryPaymentProcessor);
        logger.process("token",500.0f,false);
    }
}
