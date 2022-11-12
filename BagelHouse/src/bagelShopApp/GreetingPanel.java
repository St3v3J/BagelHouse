package bagelShopApp;

import java.awt.*;
import javax.swing.*;
public class GreetingPanel extends JPanel {
private JLabel greeting; // To display a greeting
private ImageIcon bagel; // To display a Bagel image
/**
* Constructor
*/
public GreetingPanel() {
// Create the image object
bagel = new ImageIcon("images/bagel.jpg");
// Create the label.
greeting = new JLabel("Steve's Bagel House", bagel, JLabel.LEFT);
// Add the label to this panel.
add(greeting);
// Add a raised bevel border around the panel
setBorder(BorderFactory.createRaisedBevelBorder());
// Set the background color of the panel
setBackground(Color.CYAN);
}
} 