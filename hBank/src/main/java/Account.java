public class Account {
    private long id;
    private double balance;
    private double creditLimit;

    private String accountNumber;

    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", userId=" +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
