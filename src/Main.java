import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of BankAccountManager
        BankAccountManager manager = new BankAccountManager();

        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Sample accounts to start with
        manager.addAccount(new CheckingAccount("John Doe", 1000.0));
        manager.addAccount(new SavingAccount("Jane Doe", 1500.0, 3.5));

        // Main program loop
        while (true) {
            System.out.println("\n--- Bank Account Management System ---");
            System.out.println("1. View All Accounts");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Create Saving Account");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Apply Interest to Saving Accounts");
            System.out.println("7. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left by nextInt()

            switch (choice) {
                case 1:
                    manager.displayAllAccounts();
                    break;

                case 2:
                    System.out.print("Enter account holder name: ");
                    String checkingName = scanner.nextLine();
                    System.out.print("Enter initial deposit amount: ");
                    double checkingDeposit = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    manager.addAccount(new CheckingAccount(checkingName, checkingDeposit));
                    System.out.println("Checking account created for " + checkingName);
                    break;

                case 3:
                    System.out.print("Enter account holder name: ");
                    String savingName = scanner.nextLine();
                    System.out.print("Enter initial deposit amount: ");
                    double savingDeposit = scanner.nextDouble();
                    System.out.print("Enter interest rate: ");
                    double interestRate = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    manager.addAccount(new SavingAccount(savingName, savingDeposit, interestRate));
                    System.out.println("Saving account created for " + savingName);
                    break;

                case 4:
                    System.out.print("Enter account holder name: ");
                    String depositName = scanner.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    manager.deposit(depositName, depositAmount);
                    break;

                case 5:
                    System.out.print("Enter account holder name: ");
                    String withdrawName = scanner.nextLine();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    manager.withdraw(withdrawName, withdrawAmount);
                    break;

                case 6:
                    manager.applyInterest();
                    break;

                case 7:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return; // Exit the program

                default:
                    System.out.println("Invalid option, please try again.");
            }
            System.out.println();
        }
    }
}
