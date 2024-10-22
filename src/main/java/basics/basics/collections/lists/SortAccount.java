package basics.basics.collections.lists;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

/**
 * A utility class that provides sorting functionalities for a list of Account objects.
 * The class supports sorting accounts by amount, interest rate, and due payment date.
 *
 * Example usage:
 * <pre>
 *     List<SortAccount.Account> accounts = new ArrayList<>();
 *     accounts.add(new Account(1000.0, 5.0, LocalDate.of(2024, 1, 10)));
 *     SortAccount.sortByAmount(accounts);  // Sort by amount in ascending order
 * </pre>
 *
 * The {@code Account} class encapsulates details such as amount, interest rate, and due payment date.
 *
 * @author Yassin Sohim
 */
public class SortAccount {

    /**
     * A class representing a bank account with an amount, interest rate, and due payment date.
     */
    public static class Account {
        double amount;
        double interestRate;
        LocalDate duePayment;

        /**
         * Constructs an Account with the specified amount, interest rate, and due payment date.
         *
         * @param amount the amount of money in the account
         * @param interestRate the interest rate of the account
         * @param duePayment the due date for the payment
         */
        public Account(double amount, double interestRate, LocalDate duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        /**
         * Returns the amount of money in the account.
         *
         * @return the account's amount
         */
        public double getAmount() {
            return amount;
        }

        /**
         * Returns the interest rate of the account.
         *
         * @return the account's interest rate
         */
        public double getInterestRate() {
            return interestRate;
        }

        /**
         * Returns the due payment date of the account.
         *
         * @return the account's due payment date
         */
        public LocalDate getDuePayment() {
            return duePayment;
        }
    }

    /**
     * Sorts a list of accounts by their amount in ascending order.
     *
     * @param accounts the list of accounts to be sorted
     */
    public static void sortByAmount(List<Account> accounts) {
        accounts.sort(Comparator.comparingDouble(Account::getAmount));
    }

    /**
     * Sorts a list of accounts by their interest rate in ascending order.
     *
     * @param accounts the list of accounts to be sorted
     */
    public static void sortByInterestRate(List<Account> accounts) {
        accounts.sort(Comparator.comparingDouble(Account::getInterestRate));
    }

    /**
     * Sorts a list of accounts by their due payment date in ascending order.
     *
     * @param accounts the list of accounts to be sorted
     */
    public static void sortByDuePayment(List<Account> accounts) {
        accounts.sort(Comparator.comparing(Account::getDuePayment));
    }
}
