import java.util.Scanner;
import java.security.SecureRandom;
public class Atm {
    private static Scanner sc = new Scanner(System.in);
    private static  Bank myBank = new Bank();
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu(){
        Scanner sc = new Scanner(System.in);
        String menu = """
                =============================
                Enter Your Preferred choice!!!
                
                0. Create Account
                1. Deposit
                ============================= 
                """;
        System.out.println(menu);
        int userChoice = sc.nextInt();

        switch(userChoice) {
            case 0:
                createAccount();
            case 1:
                makeDeposit();
        }

    }

    private static void makeDeposit() {
        print("Enter Account Number");
        String accountNumber = sc.nextLine();
        print("Enter Amount to deposit");
        double amount = sc.nextDouble();
        myBank.deposit(accountNumber, amount);
        print("Amount deposited successfully");
        displayMenu();
    }

    private static void createAccount() {
        SecureRandom rand = new SecureRandom();

        print("Enter first Name: ");
        String firstName = sc.next();

        print("Enter last name: ");
        String lastName = sc.next();

        String accountNumber = "003" + Integer.toString(rand.nextInt(10000000));

        print("Enter pin(4 digit Number): ");
        String pin = sc.next();

        myBank.createNewAccount(firstName, lastName, accountNumber, pin, 0);
        System.out.println("Account Created Successfully! for: " + firstName + " and your account number is " + accountNumber);
        displayMenu();

    }

    private static void print(String message){
        System.out.println(message);
    }
}
