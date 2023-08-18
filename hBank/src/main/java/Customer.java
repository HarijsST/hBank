public class Customer extends User{

    String address;
    long personalCode;

    public String getAddress() {
        return address;
    }

    public long getPersonalCode() {
        return personalCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPersonalCode(long personalCode) {
        this.personalCode = personalCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", personalCode=" + personalCode +
                '}';
    }
}
