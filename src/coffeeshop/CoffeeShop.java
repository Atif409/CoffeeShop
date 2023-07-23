package coffeeshop;

import java.util.ArrayList;

public class CoffeeShop {
    private int numEspressoCups;
    private int numCappuccinoCups;
    private int numLatteCups;
    private int numMochaCups;
    private double cash;
    private ArrayList<Customer> customers;

    public CoffeeShop() {
        numEspressoCups = 0;
        numCappuccinoCups = 0;
        numLatteCups = 0;
        numMochaCups = 0;
        cash = 0.0;
        customers = new ArrayList<>();
    }

    public void sellEspresso() {
        numEspressoCups++;
        cash += 1.5;
    }

    public void sellCappuccino() {
        numCappuccinoCups++;
        cash += 2.5;
    }

    public void sellLatte() {
        numLatteCups++;
        cash += 3.0;
    }

    public void sellMocha() {
        numMochaCups++;
        cash += 3.5;
    }

    public int getNumEspressoCups() {
        return numEspressoCups;
    }

    public int getNumCappuccinoCups() {
        return numCappuccinoCups;
    }

    public int getNumLatteCups() {
        return numLatteCups;
    }

    public int getNumMochaCups() {
        return numMochaCups;
    }

    public double getCash() {
        return cash;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void serveCustomers() {
        for (Customer customer : customers) {
            CoffeeOrder order = customer.createOrder();
            switch (order.getType()) {
                case ESPRESSO:
                    if (numEspressoCups > 0) {
                        numEspressoCups--;
                        cash += 1.5;
                        customer.serveCoffee(order);
                    }
                    break;
                case CAPPUCCINO:
                    if (numCappuccinoCups > 0) {
                        numCappuccinoCups--;
                        cash += 2.5;
                        customer.serveCoffee(order);
                    }
                    break;
                case Latte:
                    if (numLatteCups > 0) {
                        numLatteCups--;
                        cash += 3.0;
                        customer.serveCoffee(order);
                    }
                    break;
                case Mocha:
                    if (numMochaCups > 0) {
                        numMochaCups--;
                        cash += 3.5;
                        customer.serveCoffee(order);
                    }
                    break;
                default:
                    System.out.println("Invalid coffee order type.");
            }
        }
        customers.clear();
    }
}
