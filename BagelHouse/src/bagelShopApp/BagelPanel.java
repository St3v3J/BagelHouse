package bagelShopApp;

import java.awt.GridLayout;

import javax.swing.*;
/**
* The BagelPanel class allows the user to select either a white or whole wheat
* bagel.
*/
public class BagelPanel extends JPanel {
// constants indicate the cost of each type of bagel.
public final static double WHITE_BAGEL = 1.25, WHEAT_BAGEL = 1.50;
private JRadioButton whiteBagel, // To select white
wheatBagel; // To select wheat
private ButtonGroup bg; // Radio button group

public BagelPanel() {
// Create a GridLayout manager with two rows and one column.
setLayout(new GridLayout(2, 1));
// Create the radio buttons.
whiteBagel = new JRadioButton("White", true);
wheatBagel = new JRadioButton("Wheat");
// Group the radio buttons.
bg = new ButtonGroup();
bg.add(whiteBagel);
bg.add(wheatBagel);
// Add a border around the panel.
setBorder(BorderFactory.createTitledBorder("Bagel"));
// Add the radio buttons to the panel.
add(whiteBagel);
add(wheatBagel);
}
/**
getBagelCost method
*/
public double getBagelCost() {
return whiteBagel.isSelected() ? WHITE_BAGEL : WHEAT_BAGEL;
} 
}
