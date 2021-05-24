package prototype.customer;

class MedVolCustomer extends Customer implements Cloneable {

    public MedVolCustomer() {
        super();
    }

    public MedVolCustomer(String companyName) {
        super(companyName);
    }

    public Object clone() {
        return new MedVolCustomer(employerName);
    }

    public String getType() {
        return "Medium volume";
    }
}