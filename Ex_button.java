import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/** <applet code = Ex_button height = 500 width = 500> </applet>*/
public class Ex_button extends Applet implements ActionListener{
    Button B1, B2;
    String S1, S2 = " ";
    public void init(){
        B1 = new Button("YES");
        B2 = new Button("NO");

        B1.addActionListener(this);
        B2.addActionListener(this);
        add(B1);
        add(B2);
    }
    public void actionPerformed(ActionEvent ae){
        //S1 = B1.getActionCommand();
        //S1 = ae.getActionCommand();
        //System.out.println("Value =" +S1);
        //if(S1 = "YES")
        if(ae.getSource()==B1){
            S2 = "Yes Clicked";
        }
        else{
            S2 = "Not Clicked";
        }
        repaint();
    }
    public void  paint(Graphics g){
        g.drawString(S2, 100,200);
    }
}