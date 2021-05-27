import java.util.Scanner;
/**
 * @author Mahmoud Kamal Ahmed, Ali AbdelRahman Fouad Mahmoud
 * ID :20190501, 20190344
 */
public class Main {

    /**
     * last account number
     */
    private static int lastAccountNumber = 0;
    /**
     * scanner to get input from the user
     */
    private static Scanner scan;
    /**
     * the global bank
     */
    private static Bank bank1;

    /**
     * the main function of the program
     * determine the flow of the program
     * @param args no use here
     */
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        bank1 = new Bank();

        boolean isExit = false;

        while (!isExit) {
            System.out.println("You must create account before creating clint");
            System.out.println("""
                    Enter the number of the operation you want\s
                    1-Create account\s
                    2-Create clint\s
                    3-Withdraw\s
                    4-Deposit\s
                    5-Exit""");
            switch (scan.nextInt()) {
                case 1 -> createAccount();
                case 2 -> createClient();
                case 3 -> Withdraw();
                case 4 -> Deposit();
                case 5 -> isExit = true;
            }
        }
    }

    /**
     * create account and add to the bank
     */
    private static void createAccount(){
        System.out.println("""
                Enter the number of the operation you want
                1-Normal account\s
                2-SpecialAccount""");
        int choice1 = scan.nextInt();
        if (choice1 == 1) {
            Account ac1 = new Account(0.0, lastAccountNumber);
            System.out.println("your account number is " + lastAccountNumber);
            bank1.setAccounts(ac1);
            bank1.displayAccount(lastAccountNumber);
            lastAccountNumber += 1;
        } else if (choice1 == 2) {
            Account ac1 = new SpecialAccount(0.0, lastAccountNumber);
            System.out.println("your account number is " + lastAccountNumber);
            bank1.setAccounts(ac1);
            bank1.displayAccount(lastAccountNumber);
            lastAccountNumber += 1;
        }
        System.out.println("---------------------------");
    }

    /**
     * create a client and add to specific account
     */
    private static void createClient() {
        int choice;
        if (!bank1.getAccounts().isEmpty()) {
            System.out.println("""
                    Enter the number of the operation you\s
                    1-Normal clint\s
                    2-CommercialClient""");
            choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("please enter your name,nationalID,address," +
                        "phoneNumber and account number space separated");
                String name = scan.next();
                String nationalID = scan.next();
                String address = scan.next();
                String phoneNumber = scan.next();
                int account_NUMBER = scan.nextInt();
                Client cl1 = new Client(name, nationalID, address,
                        phoneNumber, bank1.getAccounts().get(account_NUMBER));
                bank1.setClients(cl1);
            } else if (choice == 2) {
                System.out.println("please enter your name,commercialID,address," +
                        "phoneNumber and account number space separated");
                String name = scan.next();
                String commercialID = scan.next();
                String address = scan.next();
                String phoneNumber = scan.next();
                int account_NUMBER = scan.nextInt();
                Client cl1 = new CommercialClient(name, commercialID, address,
                        phoneNumber, bank1.getAccounts().get(account_NUMBER));
                bank1.setClients(cl1);
            }
        } else {
            System.out.println("Please, create account before creating clint");
        }
        System.out.println("---------------------------");
    }

    /**
     * withdraw money from the account in the bank
     */
    static void Withdraw(){
        System.out.println("please enter the amount of money you want to Withdraw " +
                "and your account number space separated");
        double amount_of_money = scan.nextDouble();
        int account_NUMBER = scan.nextInt();
        bank1.getAccounts().get(account_NUMBER).withdraw(amount_of_money);
        System.out.println("---------------------------");
    }

    /**
     * deposit money to the account in the bank
     */
    static void Deposit(){
        System.out.println("please enter the amount of money you want " +
                "to Deposit and your account number space separated");
        double amount_of_money = scan.nextDouble();
        int account_NUMBER = scan.nextInt();
        bank1.getAccounts().get(account_NUMBER).deposit(amount_of_money);
        System.out.println("---------------------------");
    }
}