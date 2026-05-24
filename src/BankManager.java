/**
 * Classe principale de l'application BankManager.
 *
 * Cette application démontre le concept d'héritage en Java à travers
 * la gestion de différents types de comptes bancaires.
 *
 * Hiérarchie des classes :
 *   BankAccount (classe de base)
 *   ├── CheckingAccount  (Compte Courant)
 *   ├── SavingsAccount   (Compte Épargne)
 *   └── COD              (Certificat de Dépôt)
 */
public class BankManager {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("     BIENVENUE DANS L'APPLICATION BANKMANAGER");
        System.out.println("============================================\n");

        // -------------------------------------------------------
        // 1. COMPTE COURANT (CheckingAccount)
        // -------------------------------------------------------
        System.out.println("--- COMPTE COURANT ---");

        // Création d'une instance de CheckingAccount
        CheckingAccount checking = new CheckingAccount("CHK-001", 1500.00, 500.00);

        // Lecture des attributs hérités (account et balance)
        System.out.println("Numéro de compte : " + checking.getAccount());
        System.out.println("Solde initial    : " + checking.getBalance() + " $");
        System.out.println("Limite découvert : " + checking.getLimit() + " $");

        // Modification des attributs via les setters (hérités et propres)
        checking.setAccount("CHK-001-UPDATED");
        checking.setBalance(2000.00);
        checking.setLimit(750.00);

        // Affichage après modification
        System.out.println("\nAprès mise à jour :");
        System.out.println(checking);

        // -------------------------------------------------------
        // 2. COMPTE D'ÉPARGNE (SavingsAccount)
        // -------------------------------------------------------
        System.out.println("\n--- COMPTE D'ÉPARGNE ---");

        // Création d'une instance de SavingsAccount
        SavingsAccount savings = new SavingsAccount("SAV-002", 5000.00, 2.5);

        // Lecture des attributs hérités (account et balance)
        System.out.println("Numéro de compte : " + savings.getAccount());
        System.out.println("Solde initial    : " + savings.getBalance() + " $");
        System.out.println("Taux d'intérêt   : " + savings.getInterestRate() + "%");

        // Modification des attributs via les setters
        savings.setAccount("SAV-002-UPDATED");
        savings.setBalance(6000.00);
        savings.setInterestRate(3.0);

        // Affichage après modification
        System.out.println("\nAprès mise à jour :");
        System.out.println(savings);

        // -------------------------------------------------------
        // 3. CERTIFICAT DE DÉPÔT (COD)
        // -------------------------------------------------------
        System.out.println("\n--- CERTIFICAT DE DÉPÔT ---");

        // Création d'une instance de COD
        COD cod = new COD("COD-003", 10000.00, 12);

        // Lecture des attributs hérités (account et balance)
        System.out.println("Numéro de compte : " + cod.getAccount());
        System.out.println("Montant déposé   : " + cod.getBalance() + " $");
        System.out.println("Durée de blocage : " + cod.getMaturityMonths() + " mois");

        // Modification des attributs via les setters
        cod.setAccount("COD-003-UPDATED");
        cod.setBalance(15000.00);
        cod.setMaturityMonths(24);

        // Affichage après modification
        System.out.println("\nAprès mise à jour :");
        System.out.println(cod);

        System.out.println("\n============================================");
        System.out.println("     FIN DE L'APPLICATION BANKMANAGER");
        System.out.println("============================================");
    }
}
