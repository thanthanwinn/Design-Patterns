package org.ttw.decorator.adaptorTest;

public class CardChargeGateway {

    public boolean chargeCard(String cardToken, double amount) {
        System.out.println("Charging " + amount + " via external gateway");
        return true; // success
    }
}
