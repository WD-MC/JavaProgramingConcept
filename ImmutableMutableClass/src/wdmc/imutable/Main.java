package wdmc.imutable;



public class Main {
    private static System system;

    public static void main(String[] args) {
        // suppose that we want to do a financial transaction.
        // To avoid modifying the amount of the transaction, we will make it immutable

        Money montantTransaction = new Money(10000,"FCFA");

        // Make the transaction amount immutable
        Money montantImmuable = new Money(montantTransaction.getAmount(), montantTransaction.getCurrency());

        // Displaying the transaction amount
        system.out.println("Le montant de la transaction: " + montantImmuable.getAmount()+" "+montantImmuable.getCurrency());
    }
}
