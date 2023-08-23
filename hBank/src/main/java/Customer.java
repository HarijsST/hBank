import java.util.List;

public class Customer extends User {

    private String address;
    private String personalCode;
    private List<Account> account; //Neazimirstam pielikt klāt tipu. Izlabo tipu arī citviet

    public String getAddress() {
        return address;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public List getAccount() {
        return account;
    }

    public void setAccount(List account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", personalCode='" + personalCode + '\'' +
                ", account=" + account +
                '}';
    }
}
