package Module_6;

import java.util.List;
import java.util.Scanner;

public class TestComposerApp {

    public static void main(String[] args) {
        MemComposerDao memComposerDao = new MemComposerDao();
        System.out.println(memComposerDao.findAll());
        System.out.println(memComposerDao.findBy(1));
        memComposerDao.insert(new Composer(7,"seven","anime"));

        System.out.println(memComposerDao.findAll());

        boolean flag = true;

        while(flag) {
            System.out.println("--- MENU OPTIONS ---\n");
            System.out.println("\t1. View Cmposers");
            System.out.println("\t2. Find Composer");
            System.out.println("\t3. Add Composers");
            System.out.println("\t4. Exit");

            Scanner scan = new Scanner(System.in);
            System.out.println("\nPlease choose an option: ");
            String value = scan.next();

            if ("1".equalsIgnoreCase(value)) {
                List<Composer> c = memComposerDao.findAll();
                for(Composer cAll : c) {
                    System.out.println("ID: "+cAll.getId());
                    System.out.println("NAME: "+cAll.getName());
                    System.out.println("GENRE: "+cAll.getGenre());
                    System.out.println("-----------------");
                }
            } else if("2".equalsIgnoreCase(value)) {
                System.out.println("Enter an ID to find the composer");
                String id = scan.next();
                Composer c = memComposerDao.findBy(Integer.parseInt(id));
                System.out.println("ID: "+c.getId());
                System.out.println("NAME: "+c.getName());
                System.out.println("GENRE: "+c.getGenre());
            } else if("3".equalsIgnoreCase(value)) {
                Composer findComposer = new Composer();
                System.out.println("Enter the ID:");
                String id = scan.next();
                System.out.println("Enter the Name:");
                String name = scan.next();
                System.out.println("Enter the Genre:");
                String genre = scan.next();
                memComposerDao.insert(new Composer(Integer.parseInt(id),name,genre));
            } else {
                System.exit(0);
            }

            System.out.println("\n Want to continue? (y/n)");
            String doContinue = scan.next();
            if("n".equalsIgnoreCase(doContinue)) {
                flag = false;
            }
        }

    }
}
