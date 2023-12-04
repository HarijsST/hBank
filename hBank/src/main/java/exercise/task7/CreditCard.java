package exercise.task7;

import java.util.Objects;

public class CreditCard {
    private final String name;
    private final String number;
    private double balance = 0.00;
    private final String pinCode;
    private int invalidPinCodeCounter = 0;
    private boolean active = true;
    private boolean authorized = false;


    public CreditCard(String name, String number, String pinCode, double balance) {
        this.name = name;
        this.number = number;
        this.pinCode = pinCode;
        this.balance = balance;
    }
    public CreditCard(String name, String number, String pinCode) {
        this(name, number, pinCode, 0.00);
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getPinCode() {
        return pinCode;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void login(String pinCode) {
        if(pinCode != this.pinCode){
            invalidPinCodeCounter = invalidPinCodeCounter + 1;
            if(invalidPinCodeCounter >= 3){
                active = false;
            }
        }else if(isActive() && pinCode.equals(this.pinCode)){
            authorized = true;
            invalidPinCodeCounter = 0;
        }
    }
    public void logout() {
        authorized = false;
    }
    public void deposit(double amount) {
        if(authorized){
            balance = balance + amount;
        }
    }
    public void withdraw(double amount) {
        if(authorized && balance >= amount){
            balance = balance - amount;
        }
    }
}
