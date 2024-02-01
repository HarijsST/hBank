package invoice;

public abstract class BaseCompany {
    private String companyName;
    private String companyAddress;

    public BaseCompany(String companyName, String companyAddress) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Override
    public String toString() {
        return "CompanyCondition{" +
                "companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                '}';
    }
    public String details(){
        return getCompanyName() + " " + getCompanyAddress();
    }
}
