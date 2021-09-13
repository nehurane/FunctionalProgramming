package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        //Normal java function
        Customer customer = new Customer("Neha", "12345678");
        greetCustomer(customer);

        //Consumer Functional Interface
        greetCustomerConsumer.accept(customer);

        //BiConsumer Functional Interface
        greetCustomerBiConsumer.accept(customer, false);

    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
        System.out.println("Hello "+customer.customerName+ " thank you for registering phone number "+ customer.customerPhoneNumber);


    static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.customerName+ " thank you for registering phone number "+ customer.customerPhoneNumber);
    }

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, aBoolean)
            -> System.out.println("Hello "+customer.customerName+ " thank you for registering phone number "+
            (aBoolean ? customer.customerPhoneNumber : "*******"));


    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
