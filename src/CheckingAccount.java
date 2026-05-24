/**
 * Classe représentant un Compte Courant (Checking Account).
 * Hérite de BankAccount et ajoute une limite de découvert autorisée.
 */
public class CheckingAccount extends BankAccount {

    // Limite de découvert autorisée sur le compte courant
    private double limit;

    /**
     * Constructeur pour initialiser un compte courant.
     *
     * @param account Le numéro de compte (hérité de BankAccount)
     * @param balance Le solde initial (hérité de BankAccount)
     * @param limit   La limite de découvert autorisée
     */
    public CheckingAccount(String account, double balance, double limit) {
        // Appel du constructeur de la classe parent (BankAccount)
        super(account, balance);
        this.limit = limit;
    }

    // ==================== GETTER ====================

    /**
     * Retourne la limite de découvert du compte courant.
     * @return La limite de découvert
     */
    public double getLimit() {
        return limit;
    }

    // ==================== SETTER ====================

    /**
     * Modifie la limite de découvert du compte courant.
     * @param limit La nouvelle limite de découvert
     */
    public void setLimit(double limit) {
        this.limit = limit;
    }

    /**
     * Représentation textuelle du compte courant.
     * Inclut les informations héritées + la limite de découvert.
     * @return Une chaîne formatée avec toutes les informations
     */
    @Override
    public String toString() {
        return "[Compte Courant] " + super.toString() + " | Limite découvert: " + String.format("%.0f", limit) + " FCFA";
    }
}
