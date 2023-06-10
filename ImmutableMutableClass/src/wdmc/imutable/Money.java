package wdmc.imutable;

import java.util.Currency;

// create a immutable class
public final class Money {
    private final double amount;
    private final Currency currency;

    private final Pocket pocket;

    // create a contructor
    public Money(double amount, Currency  currency, Pocket pocket) {
        this.amount = amount;
        this.currency = currency;
        //create a defensive copy of object non-immutable
        this.pocket = new Pocket(pocket.name);
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Pocket getPocket() {
        // return a pocket copy
        return new Pocket(pocket.name);

    }
}
