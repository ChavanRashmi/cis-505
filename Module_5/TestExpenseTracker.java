package Module_5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
                    System.out.println("\n ----- MONTHLY EXPENSES -----");
                    for (Transaction trans : list) {
                        System.out.println("\nDate: "+trans.getDate());
                        System.out.println("Description: "+trans.getDescription());
                        System.out.println("Amount: "+trans.getAmount());
                    }

                } else if ("2".equalsIgnoreCase(value)) {

                    boolean addMore = true;

                    while(addMore) {
                        Scanner scanData = new Scanner(System.in);
                        System.out.println("Enter the description: ");
                        String description = scanData.nextLine();
                        System.out.println("Enter the amount: ");
                        String amount = scanData.nextLine();

                        String pattern = "MM-dd-yyyy";
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                        String date = simpleDateFormat.format(new Date());
                        System.out.println(date);

                        String dateInsert = date;
                        transaction = new Transaction(date,description,Double.valueOf(amount));

                        ArrayList<Transaction> transactionList = new ArrayList<>();
                        transactionList.add(transaction);

                        TransactionIO.bulkInsert(transactionList);

                        System.out.println("\n Add more? y/n");
                        if("n".equalsIgnoreCase(scanData.nextLine())) {
                            addMore = false;
                        }
                    }

                } else if ("3".equalsIgnoreCase(value)) {

                    ArrayList<Transaction> list = TransactionIO.findAll();
                    double monthlyExpense = 0.00;
                    for (Transaction trans : list) {
                        monthlyExpense += trans.getAmount();
                    }
                    System.out.println("Total Expense: $"+monthlyExpense);

                } else {
                    System.out.println("Invalid input.");
                }

                Scanner scanContinue = new Scanner(System.in);
                System.out.println("Continue y/n");
                if ("n".equalsIgnoreCase(scanContinue.next())) {
                    flag = false;
                }

            }
        } catch (Exception e) {
            System.out.println("Exception occured"+e);
        }
    }
}
