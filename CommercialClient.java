/**
 * @author Ali AbdelRahman Foaud Mahmoud Elgamel
 * ID :20190344
 * Use this class for the commercial client, not the regular client
 */

public class CommercialClient extends Client{

    /**
     * The commercial client commercial ID
     */
    private String commercialID;

    /**
     * constructor for commercial client
     * @param name the commercial client name
     * @param commercialID the commercial client ID
     * @param address the commercial client address
     * @param phoneNumber the commercial client phone number
     * @param account the commercial client account on bank
     */
    public CommercialClient(String name, String commercialID, String address, String phoneNumber, Account account) {
        super(name, "00000000000000", address, phoneNumber,account);
        this.commercialID = commercialID;
    }

    /**
     * get the commercial client commercial ID
     * @return commercial ID
     */
    public String getCommercialID() {
        return commercialID;
    }

    /**
     * set the commercial client commercial ID
     * @param commercialID client commercial ID
     */
    public void setCommercialID(String commercialID) {
        this.commercialID = commercialID;
    }

    /**
     * get the commercial client information in appropriate format
     * @return information of commercial client
     */
    @Override
    public String toString() {
        return "Client name: " + getName() +
                ", commercialID = " + commercialID +
                ", address: " + getAddress() +
                ", phoneNumber = " + getPhoneNumber() +
                ", account = " + getAccount();
    }
}
