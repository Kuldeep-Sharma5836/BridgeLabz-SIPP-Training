class BankAccount{
    int accountNumber;
    double balance;
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    void applyInterest() {
        balance += balance * interestRate / 100;
    }
    @Override
    void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    
    }
}
class checkingAccount extends BankAccount {
    int withdrawalLimit;
    public checkingAccount(int accountNumber, double initialBalance, int withdrawalLimit) {
        super(accountNumber, initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount {
    double maturityAmount;
    public FixedDepositAccount(int accountNumber, double initialBalance, double maturityAmount) {
        super(accountNumber, initialBalance);
        this.maturityAmount = maturityAmount;
    }
    @Override
    void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Maturity Amount: " + maturityAmount);
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(101, 1000.0, 5.0);
        BankAccount checking = new checkingAccount(102, 2000.0, 500);
        BankAccount fixedDeposit = new FixedDepositAccount(103, 3000.0, 3500.0);

        savings.displayAccountInfo();
        System.out.println();
        
        checking.displayAccountInfo();
        System.out.println();
        
        fixedDeposit.displayAccountInfo();
    }   
}
