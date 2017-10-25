@SuppressWarnings("checkstyle:all")
/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /** Checking account. */
        CHECKINGS,
        /** Savings account. */
        SAVINGS,
        /** Student account. */
        STUDENT,
        /** Workplace account. */
        WORKPLACE
    }
    /** Account number. */
    private int accountNumber;
    /** Account type. */
    public BankAccountType accountType;
    /** Balance of account. */
    private double accountBalance;

    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        accountNumber = (int)(10000000*Math.random());
        accountType = accountCategory;
        ownerName = name;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    public double getBalance() {
        return accountBalance;
    }
    public void setBalance(double n) {
        accountBalance = n;
    }
    public String getName() {
        return ownerName;
    }
    public void setName(String n) {
        ownerName = n;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
}
