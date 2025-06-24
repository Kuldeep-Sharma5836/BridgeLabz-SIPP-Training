import java.util.Scanner;
public class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;
    double amount;

    void setDetails(String accountHolderName, String accountNumber,double amount , double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.amount = amount;
    }
    double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
        return balance;
    }
    double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
        return balance;
    }
    void displayDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        
        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();
        
        System.out.println("Enter Account Number:");
        String number = sc.nextLine();
        
        System.out.println("Enter Initial Balance:");
        double initialBalance = sc.nextDouble();
        
        System.out.println("Enter Amount to Deposit/Withdraw:");
        double amount = sc.nextDouble();
        account.setDetails(name, number, initialBalance, amount);
        
        System.out.println("-------------Bank Account Details:-----------------------------------");
        account.displayDetails();
        account.deposit(amount);
        account.withdraw(amount);
    }
}
