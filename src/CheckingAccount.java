public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Balance: " + getBalance());
        System.out.println("This is a Checking Account.");
        System.out.println();
    }
}
