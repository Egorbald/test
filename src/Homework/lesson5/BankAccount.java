package Homework.lesson5;

public class BankAccount {

    int id=10;
    String name="Petr";
    double balance=100;

    // Метод для пополнения счета
    void popolnenie(double popolnenieSheta) {
        System.out.println("balans do popolnenia: " + balance);
        System.out.println("popolnenie: " + popolnenieSheta);
        balance += popolnenieSheta;
        System.out.println("balans posle popolnenia: " + balance);
        System.out.println();
    }

    // Метод для снятия со счета
    void snyatie(double snyatieSoScheta) {
        System.out.println("balans do snytie: " + balance);
        System.out.println("snytie: " + snyatieSoScheta);
        balance -= snyatieSoScheta;
        System.out.println("balans posle snytieSheta: " + balance);
        System.out.println();
    }
}

class BankAccountTest {

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Zaur";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 2.00;

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 12.12;

        MyAccount.popolnenie(30.5);
        MyAccount.snyatie(20.5);
    }
}
