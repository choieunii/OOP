package prototype.customer;

class HiVolCustomer extends Customer implements Cloneable {

    public HiVolCustomer() {
        super();
    }

    public HiVolCustomer(String companyName) {
        super(companyName);
    }

    public Object clone() {
        return new HiVolCustomer(employerName);
    }

    public String getType() {
        return "High volume";
    }

}