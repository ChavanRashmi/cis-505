/*
    Class to build a Fan class
    Author: Rashmi Chavan
 */
package Module_1;

// Fan class that holds the properties of a Fan.
public class Fan {

    final static int STOPPED = 0;
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean status;
    private double radius;
    private String color;

    public Fan() {
        speed = STOPPED;
        status = false;
        radius = 6.0;
        color = "white";
    }

    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String state = "OFF";
        if(status) {
            state = "ON";
        }
        return
                "The fan is set to " + speed +
                ", its currently " + state +
                ", with a radius " + radius +
                ", and color is " + color;
    }

}
