package coffeeshop;

public abstract class Customer {
    protected String name;
    protected String type;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public abstract void placeOrder(CoffeeShop shop);

    void serveCoffee(CoffeeOrder order) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
