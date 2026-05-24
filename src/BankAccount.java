/**
 * Classe de base représentant un compte bancaire générique.
 * Toutes les autres types de comptes héritent de cette classe.
 */
public class BankAccount {

    // Numéro du compte bancaire (identifiant unique)
    private String account;

    // Solde actuel du compte
    private double balance;

    /**
     * Constructeur pour initialiser un compte bancaire.
     *
     * @param account Le numéro de compte (ex: "ACC-001")
     * @param balance Le solde initial du compte
     */
    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    // ==================== GETTERS ====================

    /**
     * Retourne le numéro de compte.
     * @return Le numéro de compte
     */
    public String getAccount() {
        return account;
    }

    /**
     * Retourne le solde du compte.
     * @return Le solde actuel
     */
    public double getBalance() {
        return balance;
    }

    // ==================== SETTERS ====================

    /**
     * Modifie le numéro de compte.
     * @param account Le nouveau numéro de compte
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Modifie le solde du compte.
     * @param balance Le nouveau solde
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Représentation textuelle du compte bancaire.
     * @return Une chaîne formatée avec les informations du compte
     */
    @Override
    public String toString() {
        return "Compte: " + account + " | Solde: " + balance + " $";
    }
}
