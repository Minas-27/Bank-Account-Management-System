public class SavingAccount extends BankAccount {
    private final double interestRate;

    public SavingAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);  // Apply interest to the balance
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Balance: " + getBalance());
        System.out.println("This is a Saving Account with an interest rate of " + interestRate + "%.");
    }
}
