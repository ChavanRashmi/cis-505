package Module_4;

public class Shoe extends Product {

    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Shoe(double size) {
        this.size = size;
    }

    public Shoe() {
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "code='" + getCode() + '\'' +
                "description='" + getDescription() + '\'' +
                "price='" + getPrice() + '\'' +
                "size=" + size +
                '}';
    }
}
