package wdmc.imutable;


import java.util.Currency;

public class Main {
    private static System system;

    public static void main(String[] args) {
        // suppose that we want to do a financial transaction.
        // To avoid modifying the amount of the transaction, we will make it immutable
        Currency currency = Currency.getInstance("USD");
        Pocket myPocket = new Pocket("pocket");
        //myPocket.name = "pocket";
        double amount = 1000;

        Money montantTransaction = new Money(amount, currency,myPocket);
        system.out.println(
                "Le montant de la transaction: " + montantTransaction.getAmount()+
                " "+montantTransaction.getCurrency()+
                " "+montantTransaction.getPocket().name
        );

        myPocket.name="updatePocket";
        amount = 2000;

        // Make the transaction amount immutable
        //Money montantImmuable = new Money(montantTransaction.getAmount(), montantTransaction.getCurrency(),myPocket);

        // Displaying the transaction amount
        system.out.println(
                "Le montant de la transaction: " + montantTransaction.getAmount()+" "+montantTransaction.getCurrency()+
                        " "+montantTransaction.getPocket().name);
    }
}
