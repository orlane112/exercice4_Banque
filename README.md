# BankManager - Gestion de Comptes Bancaires

## Description

Application Java de démonstration de l'héritage en POO.

## Hiérarchie des classes

- `BankAccount` (Parente : `account`, `balance` protégés)
- `CheckingAccount` (Enfant : `limit`)
- `SavingsAccount` (Enfant : `interestRate`)
- `COD` (Enfant : `maturityMonths`)

## Utilisation

- **Compilation** : `javac -d bin src/*.java`
- **Exécution** : `java -cp bin Main`

## Concepts démontrés

Constructeurs `super()`, encapsulation, getters/setters, devises en **FCFA**.

*Auteur : N'guessan Miensa .*