package org.ttw.decorator.adaptorTest;

import org.ttw.decorator.PaymentProcessor;

public class CardChangeGatewayAdaptor implements PaymentProcessor {
    private final CardChargeGateway cardChargeGateway;
    private final PaymentProcessor paymentProcessor;

    public CardChangeGatewayAdaptor(CardChargeGateway cardChargeGateway, PaymentProcessor paymentProcessor) {
        this.cardChargeGateway = cardChargeGateway;
        this.paymentProcessor = paymentProcessor;
    }

    @Override
    public void process(String token, Float amount,boolean charged) {
        if (charged){
            paymentProcessor.process(token,amount,true);

        }else {
            cardChargeGateway.chargeCard(token,amount);
            paymentProcessor.process(token,amount,true);
        }
    }
}
