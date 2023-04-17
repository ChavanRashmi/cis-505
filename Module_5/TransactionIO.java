package Module_5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {

    private String FILE_NAME;
    private File file;

    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;
        if (file.exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } else {
            output = new PrintWriter(FILE_NAME);
        }
        for (Transaction trans : transactions) {
            output.print(trans.getDate() +" ");
            output.print(trans.getDescription()+ " ");
            output.println(trans.getAmount());
        }
        output.close();
    }

    public static ArrayList<Transaction> findAll() throws IOException {
        final String filename = "expense.txt";
        File file = new File(filename);
        Scanner input = new Scanner(file);
        ArrayList<Transaction> transactionList = new ArrayList<>();
        Transaction transaction = null;
        while(input.hasNext()) {
            transaction.setDate(input.nextLine());
            transaction.setDescription(input.nextLine());
            transaction.setAmount(input.nextLine());
            transactionList.add(transaction);
        }
    }
}
