import java.awt.event.*;
import java.awt.*;
import java.applet.*;

/** <applet code = "buttoncolorbg" height = "500" width = "500"</applet> */

public class Buttoncolorbg extends Applet implements ActionListener {
    Button b1;
    Button b2;
    Button b3;
    public void init(){
        b1 = new Button("Red");
        b2 = new Button("Green");
        b3 = new Button("Blue");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== b1){
            setBackgroung(Color.RED);
        }
        else if
    }
}

