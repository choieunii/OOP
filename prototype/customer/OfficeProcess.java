package prototype.customer;

import java.util.*;
import java.io.*;

class OfficeProcess {
    private static Customer customerType;
    private List<Customer> customers = new ArrayList<>();
    private static OfficeProcess officeProcess = new OfficeProcess();

    private OfficeProcess() {
        super();
    }

    public void getAndProcessCustomers() {
        Customer customer;
        String customerName = null;

        BufferedReader bufReader =  new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter customer names or '-quit'");

            while (!"-quit".equals(customerName)) {
                customerName = bufReader.readLine(); // 계속 고객의 이름을 입력받음

                if (!"-quit".equals(customerName)) { //quit가 아니면
                    customer = (Customer) OfficeProcess.customerType.clone(); // clone을 실시한다.

                    customer.setName(customerName); //입력받은 이름을 customer 객체에 set한다.
                    System.out.println("... more interaction to get information about "
                            + customerName + "... : Stored in database");
                    this.customers.add(customer); // 리스트에 고객을 넣음
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("\nThe customers entered during this session: ");
        for (Customer customerIndex : customers) {
            customer = (Customer) customerIndex;
            customer.describe(); // 리스트를 돌며 정보 표출
        }
    }

    public static Customer getCustomerPrototype() {
        return customerType;
    }

    public static OfficeProcess getOfficeProcess() {
        return officeProcess;
    }

    public void setCustomerPrototype(Customer customer) {
        customerType = customer;
    }
}