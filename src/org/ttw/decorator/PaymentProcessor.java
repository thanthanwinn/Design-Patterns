package org.ttw.decorator;

public interface PaymentProcessor {

    void process(String token, Float amount, boolean charged);
}
