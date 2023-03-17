/*
    Class to run the Fan app.
    Author: Rashmi Chavan
 */
package Module_1;

public class TestFanApp {

    public static void main(String[] args) {
        // Creating a fan object from the Fan class
        // Printing default properties
        Fan fan = new Fan();
        System.out.println(fan);

        // Creating a fan object from the Fan class
        // Setting properties
        Fan fan1 = new Fan(2,true,8.0,"purple");
        System.out.println(fan1);
    }

}
