package bagelShopApp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;
/**
The OrderHandler class contains the code for the 
Calculate and Exit buttons
*/
public class OrderHandler implements ActionListener
{
private final double TAX_RATE = 0.06; // Sales tax rate
protected OrderGUI gui; // Reference to the OrderGUI panel
/**
Constructor
*/
public OrderHandler(OrderGUI gui)
{
this.gui = gui;
}
public void actionPerformed(ActionEvent e)
{
if (e.getSource() == gui.calcButton)
{
// Variables to hold the subtotal, tax, and total
double subtotal, tax, total;
// Calculate the subtotal.
subtotal = gui.bagels.getBagelCost() + gui.toppings.getToppingCost() +
gui.coffee.getCoffeeCost();
tax = subtotal * TAX_RATE; // Calculate the sales tax.
total = subtotal + tax; // Calculate the total.
// Display the charges.
DecimalFormat dollar = new DecimalFormat("$#,##0.00");
JOptionPane.showMessageDialog(null, "Subtotal: " +dollar.format(subtotal) + "\n" +
"Tax: " + dollar.format(tax) + "\n" + "Total: " + dollar.format(total));
}
if (e.getSource() == gui.exitButton) System.exit(0);
} 
} 
