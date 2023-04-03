package Module_3;

public class Customer {

    private String customerName;
    private String customerAddress;
    private String customerCity;
    private String customerZip;

    public Customer() {
    }

    public Customer(String customerName, String customerAddress, String customerCity, String customerZip) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerCity = customerCity;
        this.customerZip = customerZip;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerZip() {
        return customerZip;
    }

    public void setCustomerZip(String customerZip) {
        this.customerZip = customerZip;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerCity='" + customerCity + '\'' +
                ", customerZip='" + customerZip + '\'' +
                '}';
    }
}
