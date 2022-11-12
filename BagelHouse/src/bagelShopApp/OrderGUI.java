package bagelShopApp;

import java.awt.*;
import javax.swing.*;
public class OrderGUI extends JPanel
{
protected BagelPanel bagels; // Bagel panel
protected ToppingPanel toppings; // Topping panel
protected CoffeePanel coffee; // Coffee panel
protected GreetingPanel banner; // To display a greeting
protected JPanel buttonPanel; // To hold the buttons
protected JButton calcButton, // To calculate the cost
exitButton; // To exit the application

// Constructor

public OrderGUI()
{
// Create a BorderLayout manager.
setLayout(new BorderLayout());
// Create the custom panels.
banner = new GreetingPanel(); bagels = new BagelPanel(); toppings = new
ToppingPanel(); coffee = new CoffeePanel();
// Create the button panel.
buildButtonPanel();
// Add the components to the content pane.
add(banner, BorderLayout.NORTH); add(bagels, BorderLayout.WEST);
add(toppings, BorderLayout.CENTER); add(coffee, BorderLayout.EAST);
add(buttonPanel, BorderLayout.SOUTH);
}
/**
The buildButtonPanel method builds the button panel.
*/
private void buildButtonPanel()
{
// A panel for the buttons.
buttonPanel = new JPanel();
// Create buttons.
calcButton = new JButton("Calculate"); exitButton = new JButton("Exit");
// Register the action listeners.
OrderHandler handler = new OrderHandler(this);
calcButton.addActionListener(handler);
exitButton.addActionListener(handler);
// Add the buttons to the button panel.
buttonPanel.add(calcButton); buttonPanel.add(exitButton);
}
} 
