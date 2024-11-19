import java.util.Scanner;

public class Account {

    private String firstName;
    private String lastName;
    private String accountNumber;
    private String pin;
    
    private double balance;
    public Account(String firstName, String lastName, String accountNumber, String pin, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getPin() {
        return pin;
    }
    public double getBalance() {
        return balance;
    }

    public double getAmount() {
    }
}
