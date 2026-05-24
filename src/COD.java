/**
 * Classe représentant un Certificat de Dépôt (COD - Certificate of Deposit).
 * Hérite de BankAccount et ajoute une durée de maturité (période de blocage).
 * Les fonds sont bloqués pour une durée déterminée en échange d'un meilleur taux.
 */
public class COD extends BankAccount {

    // Durée de maturité (période de blocage) du certificat, en mois
    private int maturityMonths;

    /**
     * Constructeur pour initialiser un certificat de dépôt.
     *
     * @param account        Le numéro de compte (hérité de BankAccount)
     * @param balance        Le montant déposé (hérité de BankAccount)
     * @param maturityMonths La durée de blocage en mois (ex: 12 pour 1 an)
     */
    public COD(String account, double balance, int maturityMonths) {
        // Appel du constructeur de la classe parent (BankAccount)
        super(account, balance);
        this.maturityMonths = maturityMonths;
    }

    // ==================== GETTER ====================

    /**
     * Retourne la durée de maturité du certificat de dépôt.
     * @return La durée de blocage en mois
     */
    public int getMaturityMonths() {
        return maturityMonths;
    }

    // ==================== SETTER ====================

    /**
     * Modifie la durée de maturité du certificat.
     * @param maturityMonths La nouvelle durée en mois
     */
    public void setMaturityMonths(int maturityMonths) {
        this.maturityMonths = maturityMonths;
    }

    /**
     * Représentation textuelle du certificat de dépôt.
     * Inclut les informations héritées + la durée de maturité.
     * @return Une chaîne formatée avec toutes les informations
     */
    @Override
    public String toString() {
        return "[Certificat de Dépôt] " + super.toString() + " | Maturité: " + maturityMonths + " mois";
    }
}
