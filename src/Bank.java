import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Account> accounts;
    private Account account;
    private double balance = 0;
    private String pin;

    public Bank(){
        accounts = new ArrayList<>();
    }


    public void createNewAccount(String firstName, String lastName, String accountNumber, String pin, double balance){
        Account createAccount = new Account(firstName, lastName, accountNumber, pin, balance);
        accounts.add(createAccount);

    }


    public void deposit(String accountNumber, double amount) {
        String AccountNumber = account.getAccountNumber();
        double amount = account.getAmount();
    }
}
