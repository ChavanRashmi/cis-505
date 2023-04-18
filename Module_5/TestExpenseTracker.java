package Module_5;

import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {

    public static void main(String[] args) {
        Transaction transaction = null;
        try {

            System.out.println("Welcome to expense tracker");

            boolean flag = true;
            while(flag) {
                System.out.println("\n MENU OPTION \n 1.View Transaction \n 2.Add Transaction \n 3.View Expense");
                System.out.println("\n Please choose an option: ");

                //System.out.println(TransactionIO.findAll());
                Scanner scan = new Scanner(System.in);
                String value = scan.next();

                if ("1".equalsIgnoreCase(value)) {
                    ArrayList<Transaction> list = TransactionIO.findAll();
                    for (Transaction trans : list) {
                        System.out.println("Date: "+trans.getDate());
                        System.out.println("Description: "+trans.getDescription());
                        System.out.println("Amount: "+trans.getAmount());
                    }
                } else if ("2".equalsIgnoreCase(value)) {

                } else if ("3".equalsIgnoreCase(value)) {

                } else {
                    System.out.println("Invalid input.");
                }

                String date = scan.nextLine();
                String description = scan.nextLine();
                String amount = scan.nextLine();
                transaction = new Transaction(date,description,Double.valueOf(amount));

                ArrayList<Transaction> transactionList = new ArrayList<>();
                transactionList.add(transaction);

                TransactionIO.bulkInsert(transactionList);
            }


        } catch (Exception e) {
            System.out.println("Exception occured"+e);
        }
    }
}
