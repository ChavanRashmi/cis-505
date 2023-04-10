package Module_4;

public class Bag extends Product {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Bag() {
    }

    public Bag(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Bag{" +
                "code='" + getCode() + '\'' +
                "description='" + getDescription() + '\'' +
                "price='" + getPrice() + '\'' +
                "type='" + type + '\'' +
                '}';
    }
}
