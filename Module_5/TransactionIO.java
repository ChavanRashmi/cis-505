package Module_5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {

    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        String FILE_NAME = "Module_5/expense.txt";
        File file = new File(FILE_NAME);
        System.out.println("Started to read file ..");
        PrintWriter output = null;
        if (file.exists()) {
            System.out.println("File found: " +FILE_NAME);
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } else {
            System.out.println("File not found: " +FILE_NAME+ " creating new file.");
            output = new PrintWriter(FILE_NAME);
        }
        for (Transaction trans : transactions) {
            output.print(trans.getDate() +" ");
            output.print(",");
            output.print(trans.getDescription()+ " ");
            output.print(",");
            output.println(trans.getAmount());
        }
        output.close();
    }

    public static ArrayList<Transaction> findAll() throws IOException {
        final String filename = "Module_5/expense.txt";
        File file = new File(filename);
        Scanner input = new Scanner(file);
        input.useDelimiter(",");

        ArrayList<Transaction> transactionList = new ArrayList<>();
        Transaction transaction = null;

        while(input.hasNextLine()) {
            String value = input.nextLine();
            String[] lineArray = value.split(",");
            transaction = new Transaction(lineArray[0],lineArray[1],Double.valueOf(lineArray[2]));
            transactionList.add(transaction);
        }
        return transactionList;
    }
}
