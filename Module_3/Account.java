package Module_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Account {

    private double balance = 200.00;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt) {
        balance = amt + balance;
    }

    public void withdraw(double amt) {
        if(amt <= balance) {
            balance = balance - amt;
        }
    }

    public void displayMenu() {
        System.out.println("Account Menu");
        System.out.println("Enter <D/d> for deposit");
        System.out.println("Enter <W/w> for withdraw");
        System.out.println("Enter <B/b> for balance");
        System.out.println(" Enter option>:");
    }

    public String getTransactionDate() {
        LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String date = dateObj.format(formatter);
        return date;
    }
}
