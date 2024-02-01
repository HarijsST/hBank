package invoice;

public class ClientCompany extends BaseCompany {
    private final int id;
    public ClientCompany(int id, String companyName, String companyAddress) {
        super(companyName, companyAddress);
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
