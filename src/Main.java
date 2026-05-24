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
public class Main {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("     BIENVENUE DANS L'APPLICATION BANKMANAGER");
        System.out.println("============================================\n");

        // -------------------------------------------------------
        // 1. COMPTE COURANT (CheckingAccount)
        // -------------------------------------------------------
        System.out.println("--- COMPTE COURANT ---");

        // Création d'une instance de CheckingAccount
        CheckingAccount checking = new CheckingAccount("CHK-001", 1500000.00, 500000.00);

        // Lecture des attributs hérités (account et balance)
        System.out.println("Numéro de compte : " + checking.getAccount());
        System.out.println("Solde initial    : " + String.format("%.0f", checking.getBalance()) + " FCFA");
        System.out.println("Limite découvert : " + String.format("%.0f", checking.getLimit()) + " FCFA");

        // Modification des attributs via les setters (hérités et propres)
        checking.setAccount("CHK-001-UPDATED");
        checking.setBalance(2000000.00);
        checking.setLimit(750000.00);

        // Affichage après modification
        System.out.println("\nAprès mise à jour :");
        System.out.println(checking);

        // -------------------------------------------------------
        // 2. COMPTE D'ÉPARGNE (SavingsAccount)
        // -------------------------------------------------------
        System.out.println("\n--- COMPTE D'ÉPARGNE ---");

        // Création d'une instance de SavingsAccount
        SavingsAccount savings = new SavingsAccount("SAV-002", 5000000.00, 3.5);

        // Lecture des attributs hérités (account et balance)
        System.out.println("Numéro de compte : " + savings.getAccount());
        System.out.println("Solde initial    : " + String.format("%.0f", savings.getBalance()) + " FCFA");
        System.out.println("Taux d'intérêt   : " + savings.getInterestRate() + "%");

        // Modification des attributs via les setters
        savings.setAccount("SAV-002-UPDATED");
        savings.setBalance(6500000.00);
        savings.setInterestRate(4.0);

        // Affichage après modification
        System.out.println("\nAprès mise à jour :");
        System.out.println(savings);

        // -------------------------------------------------------
        // 3. CERTIFICAT DE DÉPÔT (COD)
        // -------------------------------------------------------
        System.out.println("\n--- CERTIFICAT DE DÉPÔT ---");

        // Création d'une instance de COD
        COD cod = new COD("COD-003", 10000000.00, 12);

        // Lecture des attributs hérités (account et balance)
        System.out.println("Numéro de compte : " + cod.getAccount());
        System.out.println("Montant déposé   : " + String.format("%.0f", cod.getBalance()) + " FCFA");
        System.out.println("Durée de blocage : " + cod.getMaturityMonths() + " mois");

        // Modification des attributs via les setters
        cod.setAccount("COD-003-UPDATED");
        cod.setBalance(15000000.00);
        cod.setMaturityMonths(24);

        // Affichage après modification
        System.out.println("\nAprès mise à jour :");
        System.out.println(cod);

        System.out.println("\n============================================");
        System.out.println("     FIN DE L'APPLICATION BANKMANAGER");
        System.out.println("============================================");
    }
}
