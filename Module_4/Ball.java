package Module_4;

public class Ball extends Product {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Ball() {
    }

    public Ball(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Ball{" +
                "code='" + getCode() + '\'' +
                "description='" + getDescription() + '\'' +
                "price='" + getPrice() + '\'' +
                "color='" + color + '\'' +
                '}';
    }
}
