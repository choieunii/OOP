package prototype.customer;

abstract class Customer {
    protected String name;
    protected String employerName;

    public Customer() {
    }

    public Customer(String employerName) {
        this.employerName = employerName;
    }

    public abstract Object clone();

    public void describe() {
        System.out.println("Customer " + name + ", an employee of " +
                employerName + ".  Spending category: " + getType() + ".  Lots more ....");
    } //직원과 고객 정보 출력

    public abstract String getType();

    public void setName(String name) {
        this.name = name;
    }
}