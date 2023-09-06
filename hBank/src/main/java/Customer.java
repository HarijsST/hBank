import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

    private String address;
    private String personalCode;
    private List<Account> account = new ArrayList<>();

    private String accountNumber;

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

    public void addAccount(Account account) {
        // paņemt account sarakstu un tam pievienot klāt šo account izmantojot add metodi;
    }

    @Override
    public String toString() {
        return "Klienta vārds uzvārds: " + getName() + " " + getSurname() + "\n" +
                "Klienta adrese: " + address + "\n" +
                "Klienta personas kods: " + personalCode + "\n";
    }
}
