import java.awt.*;
import java.applet.*;
/** <applet code = "linerect" height= "500", width = "500"> </applet>*/
public class linerect extends Applet{
    public void paint(Graphics g){
        g.drawLine(20,30,40,60);
        g.drawRect(10,20,50,40);
    }
    public void init(){

    }
}