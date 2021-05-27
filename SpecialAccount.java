/**
 * @author      Mustafa Magdy Soltan
 * ID :20190665
 */
public class SpecialAccount extends Account{

    // Constructor
    public SpecialAccount(double balance, int accountNumber) {
        super(balance, accountNumber);
    }

    /**
     * withdraw balance from special account of client.
     * enabling the special account to withdraw without the
     * need to have these money in his account,
     * with a limit of 1000 currencies, with a balance 0
     * @param w the withdraw taken by client
     */
    public void withdraw(double w)
    {
        if (getBalance() >= w)
        {
            double temp=getBalance();
            temp -= w;
            setBalance(temp);
            System.out.println("Success Withdraw ");
            System.out.println("Your Account Number = " + getAccountNumber());
            System.out.println("Your current balance = " + temp);
        }
        else if (getBalance() < w && (getBalance() - w) >= -1000)
        {
            double temp=getBalance();
            temp -= w;
            setBalance(temp);
            System.out.println("Success Withdraw ");
            System.out.println("Your Account Number = " + getAccountNumber());
            System.out.println("Your current balance = " + temp);
        }
        else
            System.out.println("failed withdraw ,Not Allowed");
    }
}
