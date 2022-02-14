package task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerAggregator {
    private Customer[] customers;

    public CustomerAggregator(Customer[] customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "CustomerAggregator{" +
                "customers=" + Arrays.toString(customers) +
                '}';
    }

    public Customer[] getCustomersSortedByName() {
        List<Customer> sorterCustomers = new ArrayList<>(Arrays.asList(customers));
        sorterCustomers.sort(new CustomerNameComparator());
        return sorterCustomers.toArray(new Customer[0]);
    }

    public Customer[] getCustomersSortedByCreditCard(long low, long high) {
        List<Customer> result = new ArrayList<>();
        for (Customer customer : this.customers) {
            if (customer.getCreditCardNumber() > low && customer.getCreditCardNumber() < high)
            result.add(customer);
        }
        return result.toArray(new Customer[0]);
    }
}
