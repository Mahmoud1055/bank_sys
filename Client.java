/**
 * @author Ali AbdelRahman Foaud Mahmoud Elgamel
 * ID :20190344
 * Use this class for the regular client
 */
public class Client {

    /**
     * The name of the client
     */
    private String name;
    /**
     * The client national id
     */
    private String nationalID;
    /**
     * The client address
     */
    private String address;
    /**
     * The client phone number
     */
    private String phoneNumber;
    /**
     * The client account
     */
    private Account account;

    /**
     * Constructor for the client
     * @param name client name
     * @param nationalID client national ID
     * @param address client address
     * @param phoneNumber client phone number
     * @param account client account in the bank
     */
    public Client(String name, String nationalID, String address, String phoneNumber, Account account) {
        this.name = name;
        this.nationalID = nationalID;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.account = account;
    }
    /**
     * get the client name
     * @return client name
     */
    public String getName() {
        return name;
    }

    /**
     * set the client name
     * @param name client name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get client national ID
     * @return client national ID
     */
    public String getNationalID() {
        return nationalID;
    }

    /**
     * set the client national ID
     * @param nationalID client national ID
     */
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    /**
     * get the client address
     * @return client address
     */
    public String getAddress() {
        return address;
    }

    /**
     * set the client address
     * @param address client address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * get the client phone number
     * @return client phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * set the client phone number
     * @param phoneNumber client phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    /**
     * get the client account
     * @return client account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * set the client account
     * @param account client account
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * get the client information in appropriate format
     * @return the client information
     */
    @Override
    public String toString() {
        return "Client name: " + name +
                ", nationalID = " + nationalID +
                ", address: " + address +
                ", phoneNumber = " + phoneNumber +
                ", account = " + account;
    }
}
