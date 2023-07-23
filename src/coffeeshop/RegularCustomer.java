package coffeeshop;

public class RegularCustomer extends Customer {
    public RegularCustomer(String name) {
        super(name);
        type = "Regular";
    }

    public void placeOrder(CoffeeShop shop) {
        Espresso espresso = new Espresso();
        CoffeeOrder order = new CoffeeOrder(this, espresso);
        shop.takeOrder(order);
    }
}
