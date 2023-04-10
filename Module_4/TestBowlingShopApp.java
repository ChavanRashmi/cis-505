package Module_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestBowlingShopApp {

    public static void displayMenu() {
        System.out.println("\nMENU OPTIONS");
        System.out.println("1. <b> Bowling balls");
        System.out.println("2. <a> Bowling bags");
        System.out.println("3. <s> Bowling shoes");
        System.out.println("4. <x> To exit\n");
        System.out.println("Please choose an option: ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean doBreak = false;
        while(!doBreak) {
            displayMenu();
            String userValue = scan.next();
            if(userValue.equalsIgnoreCase("x")) {
                System.out.println("\n End of line ...");
                break;
            }
            GenericQueue<Product> queue1 = ProductDB.getProduct(userValue);
            int i = queue1.size();
            while(i>0) {
                System.out.println("Product code: "+queue1.dequeue());
                i--;
            }
        }
    }
}
