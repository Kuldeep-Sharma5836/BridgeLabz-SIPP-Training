class Bank {
    static String BankName = "State Bank of India";
    static int totalAccounts = 0;
    
    final int accountNumber;
    String accountHolderName;
    double balance;
    public Bank(int accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;
    }
    static void gettotalAccounts() {
        System.out.println("Total Accounts in " + BankName + ": " + totalAccounts);
    }
    void Details() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
    }
}
public class BankManagement {
    public static void main(String[] args) {
        Bank account1 = new Bank(101, "Kuldeep Sharma", 1000000000.0);
        Bank account2 = new Bank(102, "Amit ", 500000.0);
        
        Bank.gettotalAccounts();
        System.out.println();
        if (account1 instanceof Bank) {
            account1.Details();
        }
        System.out.println();
        if (account2 instanceof Bank) {
            account2.Details();
        }
    }
}
