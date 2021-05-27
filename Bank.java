import java.util.ArrayList;
/**
 * @author Mahmoud Kamal Ahmed
 * ID :20190501
 */
public class Bank {
    /**
     * the name of the bank
     */
    private String name;
    /**
     * the bank phone
     */
    private String phone;
    /**
     * the bank address
     */
    private String address;
    /**
     * the list of the accounts
     */
    private ArrayList <Account> accounts = new ArrayList<>();
    /**
     * the list of the clients
     */
    private ArrayList <Client> clients= new ArrayList<>();
    public Bank() {

    }
    public Bank(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
//Setter
    /**
     * set the phone value
     * <p>
     * @param  phone the phone of the bank
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * set the name value
     * <p>
     * @param  name the name of the bank
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * set the address value
     * <p>
     * @param  address the address of the bank
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * set a client in the clients list
     * <p>
     * @param  clint the client you want to set in the list
     */
    public void setClients( Client clint) {
        clients.add(clint);
    }
    /**
     * set a CommercialClient in the clients list
     * <p>
     * @param   name the client`s name
     * @param   commercialID the client`s commercialID
     * @param   address the client`s address
     * @param   phoneNumber the client`s phoneNumber
     * @param   account the client`s account
     */
    public void setCommercialClient1(String name, String commercialID, String address, String phoneNumber, Account account) {
        CommercialClient a1=new CommercialClient(name,commercialID,address,phoneNumber,account);
        clients.add(a1);
    }
    /**
     * set a SpecialAccount in the accounts list
     * <p>
     * @param   balance the balance of the account
     * @param   accountnumber the number of the account
     */
    public void setSpecialAccount(double balance,int accountnumber) {
        SpecialAccount a1=new SpecialAccount(balance,accountnumber);
        accounts.add(a1);
    }
    /**
     * set a Account in the accounts list
     * <p>
     * @param   account the account you want to set in the list
     */
    public void setAccounts(Account account) {
        accounts.add(account) ;
    }
    /**
     * set a Account for a client
     * <p>
     * @param   client_account the account of the clint
     * @param   index the index of the clint
     */
    public void setClientAccount (Account client_account,int index ){
        getClients().get(index).setAccount(client_account);
    }
    //Getter
    /**
     * gets the name of the bank.
     * <p>
     * @return name return name of the bank
     */
    public String getName() {
        return name;
    }
    /**
     * gets the phone of the bank.
     * <p>
     * @return phone return the phone of the bank
     */
    public String getPhone() {
        return phone;
    }
    /**
     * gets the address of the bank.
     * <p>
     * @return address  return the address of the bank
     */
    public String getAddress() {
        return address;
    }
    /**
     * gets an account from the accounts list
     * <p>
     * @return accounts return the accounts  list
     */
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    /**
     *  gets an clients from the clients list
     * <p>
     * @return clients return the clients list
     */
     public ArrayList<Client> getClients() {
        return clients;
    }
//Display
    /**
     * display the account information
     * <p>
     * @param  index the index of the account in the list
     */
     public void displayAccount (int index) {
        System.out.println(accounts.get(index));
    }
    /**
     * display the client information
     * <p>
     * @param  index the index of the client in the list
     */
    public void displayClient (int index) {
        System.out.println(clients.get(index));
    }


}
