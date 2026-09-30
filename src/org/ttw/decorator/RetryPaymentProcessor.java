package org.ttw.decorator;

public class RetryPaymentProcessor implements PaymentProcessor{
    private final PaymentProcessor paymentProcessor;
    public RetryPaymentProcessor(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }


    @Override
    public void process() {
        int maxAttempts = 3;
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try {
                paymentProcessor.process();
                System.out.println("succeeded on attempt " + attempt);
                return; // success — stop retrying
            } catch (Exception e) {
                System.out.println("attempt " + attempt + " failed");
                if (attempt == maxAttempts) {
                    System.out.println("tried " + maxAttempts + " times, still failed");
                }
            }
        }
    }
}
