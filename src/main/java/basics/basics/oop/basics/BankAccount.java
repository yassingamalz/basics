package basics.basics.oop.basics;

/**
 * A class representing a bank account with basic operations for managing a balance.
 * This class provides methods to deposit and withdraw funds, as well as to retrieve
 * the current balance of the account.
 *
 * Example usage:
 * <pre>
 *     BankAccount account = new BankAccount();
 *     account.deposit(100.0);
 *     account.withdraw(50.0);
 *     double balance = account.getBalance(); // Returns 50.0
 * </pre>
 *
 * @author Yassin Sohim
 */
public class BankAccount {
    private double balance;

    /**
     * Creates a bank account with an initial balance of 0.
     */
    public BankAccount() {
        this.balance = 0;
    }

    /**
     * Creates a bank account with a specified initial balance.
     *
     * @param balance the initial balance of the account
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * Retrieves the current balance of the bank account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deposits a specified amount into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws a specified amount from the bank account if there are sufficient funds.
     * If the withdrawal amount exceeds the current balance, the transaction is not performed.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }
}
