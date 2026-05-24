/**
 * Classe représentant un Compte d'Épargne (Savings Account).
 * Hérite de BankAccount et ajoute un taux d'intérêt annuel.
 */
public class SavingsAccount extends BankAccount {

    // Taux d'intérêt annuel du compte d'épargne (en pourcentage)
    private double interestRate;

    /**
     * Constructeur pour initialiser un compte d'épargne.
     *
     * @param account      Le numéro de compte (hérité de BankAccount)
     * @param balance      Le solde initial (hérité de BankAccount)
     * @param interestRate Le taux d'intérêt annuel (ex: 2.5 pour 2.5%)
     */
    public SavingsAccount(String account, double balance, double interestRate) {
        // Appel du constructeur de la classe parent (BankAccount)
        super(account, balance);
        this.interestRate = interestRate;
    }

    // ==================== GETTER ====================

    /**
     * Retourne le taux d'intérêt annuel du compte d'épargne.
     * @return Le taux d'intérêt en pourcentage
     */
    public double getInterestRate() {
        return interestRate;
    }

    // ==================== SETTER ====================

    /**
     * Modifie le taux d'intérêt annuel.
     * @param interestRate Le nouveau taux d'intérêt
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Représentation textuelle du compte d'épargne.
     * Inclut les informations héritées + le taux d'intérêt.
     * @return Une chaîne formatée avec toutes les informations
     */
    @Override
    public String toString() {
        return "[Compte Épargne] " + super.toString() + " | Taux d'intérêt: " + interestRate + "%";
    }
}
