package task8;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = createCustomers();
        CustomerAggregator aggregator = new CustomerAggregator(customers);

        aggregator.getCustomersSortedByName();
        aggregator.getCustomersSortedByCreditCard(1L, 4L);
    }


    private static Customer[] createCustomers() {
        Customer customer1 = new Customer(1, "Turko", "Olga", "Sergeevna", "Minsk," +
                "Lenina street, 12", 2L, "BY3014123123123027000");
        Customer customer2 = new Customer(2, "Ivanov", "Ivan", "Akimovich", "Vitebsk," +
                "Tvarskaya street, 56", 5L, "BY301412555555027000");
        Customer[] customers = new Customer[]{customer1, customer2};
        return customers;
    }

}
