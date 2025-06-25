import java.applet.*;
import java.awt.*;
/**<applet code = Ex_color height = 500 width = 500> </applet> */
public class Ex_color extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello", 100, 200);
        g.setColor(Color.BLUE);
        g.drawString("Welcome", 100, 240);
        Color c1 = new Color(100, 200, 250);
        g.setColor(c1);
        //g.setColor(new Color(100,200,250));
        g.drawString("Bye", 100, 300);
    }
    public void init(){
        setBackground(Color.YELLOW);
        setForeground(Color.RED);
    }
}