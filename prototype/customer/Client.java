package prototype.customer;

class Client {
    public Client() {
        super();
    }

    public void DoOfficeProcess() {
        System.out.println("\nClient does some work .....");
        System.out.println("\nClient calls on the application of Prototype pattern .....");
        OfficeProcess.getOfficeProcess().getAndProcessCustomers();
        System.out.println("\nClient does more work .....");
    }

    public void doOfficeProcess() {
        System.out.println("\nClient does some work .....");
        System.out.println("\nClient calls on the application of Prototype pattern .....");
        OfficeProcess.getOfficeProcess().getAndProcessCustomers();
        System.out.println("\nClient does more work .....");
    }
}