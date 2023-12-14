import java.util.Scanner;
class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            System.out.println("Invalid amount for deposit.");
            return false;
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient balance.");
            return false;
        }
    }
    public double checkBalance() {
        return this.balance;
    }
}
class ATM {
    private final BankAccount userAccount;
    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }
    public void displayOptions() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }
    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (userAccount.withdraw(amount)) {
            System.out.println("Withdrawal successful. Remaining balance: " + userAccount.checkBalance());
        }
    }
    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (userAccount.deposit(amount)) {
            System.out.println("Deposit successful. Current balance: " + userAccount.checkBalance());
        }
    }
    public void checkBalance() {
        System.out.println("Your current balance is: " + userAccount.checkBalance());
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayOptions();
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
public class Task03 {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0);
        ATM atmMachine = new ATM(userAccount);
        atmMachine.start();
    }
}

