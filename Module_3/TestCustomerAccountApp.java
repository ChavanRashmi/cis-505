package Module_3;

import java.util.Scanner;

public class TestCustomerAccountApp {
    public static void main(String[] args) {
        boolean continueMore = true;
        while (continueMore) {
            System.out.println("Welcome to the Customer Account App\n");
            System.out.println("Enter a Customer ID:");
            Scanner scan = new Scanner(System.in);
            Customer customer = CustomerDB.getCustomer(scan.nextInt());

            Account account = new Account();
            account.displayMenu();

            String menuOption = scan.next();
            if ("B".equalsIgnoreCase(menuOption)) {
                System.out.println("Account balance: " + account.getBalance());
            } else if ("W".equalsIgnoreCase(menuOption)) {
                System.out.println("\nEnter withdraw value:");
                double withdrawValue = Double.parseDouble(scan.next());
                account.withdraw(withdrawValue);
                System.out.println("Account balance: " + account.getBalance());
            } else if ("D".equalsIgnoreCase(menuOption)) {
                System.out.println("\nEnter deposit value:");
                double depositValue = Double.parseDouble(scan.next());
                account.deposit(depositValue);
                System.out.println("Account balance: " + account.getBalance());
            } else {
                System.out.println("Invalid option");
            }

            System.out.println("Continue(y/n): ");
            String continueMoreValue = scan.next();
            if ("n".equalsIgnoreCase(continueMoreValue)) {
                continueMore = false;
                System.out.println("\n---- Customer Details ----");
                System.out.println("Name: "+customer.getCustomerName());
                System.out.println("Address: "+customer.getCustomerAddress());
                System.out.println("City: "+customer.getCustomerCity());
                System.out.println("Zip: "+customer.getCustomerZip());
                System.out.println("\n Balance as of "+account.getTransactionDate()+" is "+account.getBalance());
            }
        }
    }
}
