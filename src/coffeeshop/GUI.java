package coffeeshop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    private CoffeeShop coffeeShop;
    private JButton espressoButton;
    private JButton cappuccinoButton;
    private JTextField espressoCupsTextField;
    private JTextField cappuccinoCupsTextField;
    private JTextField cashTextField;

    public GUI(CoffeeShop coffeeShop) {
        this.coffeeShop = coffeeShop;
        setTitle("Coffee Shop");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        espressoButton = new JButton("Sell Espresso");
        cappuccinoButton = new JButton("Sell Cappuccino");
        espressoCupsTextField = new JTextField("0");
        cappuccinoCupsTextField = new JTextField("0");
        cashTextField = new JTextField("0.0");

        espressoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coffeeShop.sellEspresso();
                espressoCupsTextField.setText("" + coffeeShop.getNumEspressoCups());
                cashTextField.setText("" + coffeeShop.getCash());
            }
        });

        cappuccinoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coffeeShop.sellCappuccino();
                cappuccinoCupsTextField.setText("" + coffeeShop.getNumCappuccinoCups());
                cashTextField.setText("" + coffeeShop.getCash());
            }
        });

        add(new JLabel("Espresso Cups Sold:"));
        add(espressoCupsTextField);
        add(new JLabel("Cappuccino Cups Sold:"));
        add(cappuccinoCupsTextField);
        add(new JLabel("Cash Earned:"));
        add(cashTextField);
        add(espressoButton);
        add(cappuccinoButton);

        setVisible(true);
    }
}
