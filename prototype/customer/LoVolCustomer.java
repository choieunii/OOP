package prototype.customer;

class LoVolCustomer extends Customer implements Cloneable {

    public LoVolCustomer() {
        super();
    }

    public LoVolCustomer(String companyName) {
        super(companyName);
    }

    public Object clone() {
        return new LoVolCustomer(employerName);
    }

    public String getType() {
        return "Low volume";
    }
}