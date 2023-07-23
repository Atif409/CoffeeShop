package coffeeshop;

public class PremiumCustomer extends Customer {
    public PremiumCustomer(String name) {
        super(name);
        type = "Premium";
    }

    public void placeOrder(CoffeeShop shop) {
        Latte latte = new Latte();
        Mocha mocha = new Mocha();
        CoffeeOrder order1 = new CoffeeOrder(this, latte);
        CoffeeOrder order2 = new CoffeeOrder(this, mocha);
        shop.takeOrder(order1);
        shop.takeOrder(order2);
    }
}
