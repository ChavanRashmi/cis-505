package Module_3;

public class CustomerDB {

    public static Customer getCustomer(Integer id) {
        if (id == 1007) {
            return new Customer("Customer1","1027 N Bayonne St","New Jersey","900002");
        } else if (id == 1008) {
            return new Customer("Customer2","3022 S Convoy St","New Orleans","400053");
        } else if (id == 1009) {
            return new Customer("Customer3","Jackson St","Nebrasks","999992");
        } else {
            return new Customer("DefaultCustomer","Default St","New Default City","111111");
        }
    }
}
