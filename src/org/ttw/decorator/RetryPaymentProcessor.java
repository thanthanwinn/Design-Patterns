package org.ttw.decorator;

public class RetryPaymentProcessor implements PaymentProcessor{
    private final PaymentProcessor paymentProcessor;
    public RetryPaymentProcessor(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }


    @Override
    public void process(String token, Float amount, boolean charged) {
        int maxAttempts = 3;
        boolean cardCharge = charged;
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            if (attempt > 1){
                cardCharge = true;
            }
            try {
                paymentProcessor.process(token,amount,cardCharge);
                System.out.println("succeeded on attempt " + attempt);
                return;
            } catch (Exception e) {
                System.out.println("attempt " + attempt + " failed");
                if (attempt == maxAttempts) {
                    System.out.println("tried " + maxAttempts + " times, still failed");
                }
            }
        }
    }
}
