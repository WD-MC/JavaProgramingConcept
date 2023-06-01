package wdmc.imutable;

// create a immutable class
public final class Money {
    private final double amount;
    private final String currency;

    // create a contructor
    public Money(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}
