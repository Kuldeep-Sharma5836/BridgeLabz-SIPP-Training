
class BankAccount {
    public String accountNumber;      
    protected String accountHolder;  
    private double balance;           

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displaySavingsInfo() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number (public): " + accountNumber);
        System.out.println("Account Holder (protected): " + accountHolder);
        System.out.println("Current Balance (via getter): ₹" + getBalance());
    }
}

public class BankManagement {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SB10123", "Kuldeep Sharma", 1000000000.0);

        sa.displayAccountInfo();      
        System.out.println();
        sa.displaySavingsInfo();      

        System.out.println("\nPerforming Transactions...");
        sa.deposit(2500);
        sa.withdraw(1500);
        System.out.println("Updated Balance: ₹" + sa.getBalance());
    }
}
