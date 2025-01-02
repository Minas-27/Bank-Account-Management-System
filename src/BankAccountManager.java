import java.util.ArrayList;
import java.util.List;

public class BankAccountManager {
    private List<BankAccount> accounts;

    public BankAccountManager() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }
        for (BankAccount account : accounts) {
            account.displayAccountInfo();
            System.out.println("-------------------------------");
        }
    }

    public void deposit(String accountHolder, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountHolder().equalsIgnoreCase(accountHolder)) {
                account.deposit(amount);
                System.out.println(amount + " deposited. New balance: " + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void withdraw(String accountHolder, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountHolder().equalsIgnoreCase(accountHolder)) {
                account.withdraw(amount);
                System.out.println(amount + " withdrawn. New balance: " + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void applyInterest() {
        for (BankAccount account : accounts) {
            if (account instanceof SavingAccount savingAccount) {
                savingAccount.applyInterest();
                System.out.println("Interest applied. New balance: " + savingAccount.getBalance());
            }
        }
    }
}
