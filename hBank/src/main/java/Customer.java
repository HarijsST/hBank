import java.util.List;

public class Customer extends User {

    private String address;
    private String personalCode;
    private List<Account> account;

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

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Klienta vārds uzvārds: " + getName() + " " + getSurname() + "\n" +
                "Klienta adrese: " + address + "\n" +
                "Klienta personas kods: " + personalCode;
    }
}
