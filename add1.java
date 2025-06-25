import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** <applet code="add1" height="500" width="500"></applet> */
public class add1 extends Applet implements ActionListener{
    TextField tf1;
    TextField tf2;
    Button b1;
    String Result = " ";

    public void init(){
        Label label1 = new Label("Enter num1:");
        Label label2 = new Label("Enter num2:");
        b1 = new Button("ADD");
        tf1 = new TextField(10);
        tf2 = new TextField(10);

        b1.addActionListener(this);

        add(label1);
        add(tf1);
        add(label2);
        add(tf2);
        add(b1);

    } 
    @Override
    public void actionPerformed(ActionEvent ae){
        try{
        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());

        int sum = num1+num2;

        Result = "Sum: "+sum;
        }
        catch(NumberFormatException e){
            Result = "Enter Valid number";
        }
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(Result, 299, 299);
    }
}
