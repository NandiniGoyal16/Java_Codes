import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** 
<applet code="add" height=500 width=500> 
</applet> 
*/
public class add extends Applet implements ActionListener {
    Button sumButton;
    TextField num1Field, num2Field;
    String result = " ";
    
    public void init() {
        // Create and set up components
        Label num1Label = new Label("Number 1:");
        Label num2Label = new Label("Number 2:");
        num1Field = new TextField(10);
        num2Field = new TextField(10);
        sumButton = new Button("SUM");

        // Add action listener to the button
        sumButton.addActionListener(this);

        // Add components to the applet
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(sumButton);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            // Parse input from text fields
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());

            // Calculate sum
            int sum = num1 + num2;

            // Update the result string
            result = "Sum: " + sum;
        } catch (NumberFormatException e) {
            // Handle invalid input
            result = "Invalid input!";
        }

        // Request repaint
        repaint();
    }

    public void paint(Graphics g) {
        // Display the result
        g.drawString(result, 100, 200);
    }
}
