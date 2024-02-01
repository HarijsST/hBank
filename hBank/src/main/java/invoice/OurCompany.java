package invoice;

public class OurCompany extends CompanyCondition {


    public OurCompany(String companyName, String companyAddress) {
        super(companyName, companyAddress);
    }
    public String rekviziti(){
        return getCompanyName() + " " + getCompanyAddress();
    }
}

