public class Account {
    long id;
    long userId;
    double balance;
    double creditLimit;

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
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

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", userId=" + userId +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
