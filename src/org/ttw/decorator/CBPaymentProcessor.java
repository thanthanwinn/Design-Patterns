package org.ttw.decorator;

public class CBPaymentProcessor implements PaymentProcessor{
    private int callCount = 0;

    @Override
    public void process() {
        callCount++;
        if (callCount == 1) {
            throw new RuntimeException("failed on first attempt");
        }
        System.out.println("CB payment Processing succeeded");
    }
}
