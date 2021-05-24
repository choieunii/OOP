package prototype.customer;

import java.util.*;
import java.io.*;

class Test {
    public Test() {
        super();
    }

    public static void main(String[] args) {
        OfficeProcess officeProcess = OfficeProcess.getOfficeProcess();

        System.out.println("Enter company name");
        String companyName = "not yet selected";
        try {
            BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
            companyName = br.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Now the application would collect lots more company information ....");


        Hashtable customerTypeHashtable = new Hashtable();
        customerTypeHashtable.put("low", new LoVolCustomer(companyName));
        customerTypeHashtable.put("medium", new MedVolCustomer(companyName));
        customerTypeHashtable.put("high", new HiVolCustomer(companyName));

        System.out.println("\nPlease pick a type of customer from one of the following:"
                + "('medium' will be assumed otherwise)");
        for (Enumeration enumeration = customerTypeHashtable.keys(); enumeration.hasMoreElements(); ) {
            System.out.println(enumeration.nextElement());
        }

        String customerTypeSelected = "not yet selected";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            customerTypeSelected = br.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }

        officeProcess.setCustomerPrototype
                ((Customer) customerTypeHashtable.get(customerTypeSelected));
        if (officeProcess.getCustomerPrototype() == null)
            officeProcess.setCustomerPrototype(new MedVolCustomer(companyName));

        Client client = new Client();
        client.doOfficeProcess();
    }

}