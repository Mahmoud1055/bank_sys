/**
 * @author      Mustafa Magdy Soltan
 * ID :20190665
 */
public class Account {
    /**
     * the balance of client
     */
    private double balance;
    /**
     * the account number of client
     */
    private int accountNumber;
    private static int index=-1;

    // Constructor
    public Account(double balance , int accountNumber)
    {
        this.balance = balance;
        this.accountNumber = accountNumber;
        index+=1;
    }
    // Setters
    /**
     * set the balance value
     * <p>
     * @param  balance the balance of the client
     */
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    /**
     * set the account number value
     * <p>
     * @param  accountNumber the account number of the client
     */
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    //Getters
    public static int getIndex() {
        return index;
    }
    /**
     * gets the balance of the client.
     * <p>
     * @return balance return balance of the client
     */
    public double getBalance()
    {
        return balance;
    }
    /**
     * gets the account number of the client.
     * <p>
     * @return accountNumber return account number of the client
     */
    public double getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * withdraw balance from account of client.
     * <p>
     * @param w the withdraw taken by client
     */
    public void withdraw(double w)
    {
        // Enough balance should be available.
        if (balance >= w)
        {
            balance -= w;
            System.out.println("Success Withdraw ");
            System.out.println(", Your Account Number = " + accountNumber +", Your current balance = " + balance);
        }
        else {
            System.out.println("Not enough balance");
        }
    }

    /**
     * deposit balance for account of client.
     * <p>
     * @param d the deposit put by client
     */
    public void deposit(double d)
    {
        balance += d;
        System.out.println("Success Deposit ");
        System.out.println(", Your Account Number = " + accountNumber +", Your current balance = " + balance);
    }
    /**
     * Display current balance and number of account.
     */
    @Override
    public String toString()
    {
        return "Balance = " + balance + ", Account Number = " + accountNumber;
    }
}