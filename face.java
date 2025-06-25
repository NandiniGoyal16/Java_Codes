import java.applet.*;
import java.awt.*;
/** <applet code = "face" height = 500 width = 500> </applet>*/
public class face extends Applet{
	public void paint(Graphics g){
		g.drawOval(100,100,200,200);
		g.fillOval(150,150,20,20);
		g.fillOval(230,150,20,20);
		g.drawLine(200, 180, 200, 220);
		g.drawLine(150,250,250,250);
	}
	public void init(){

	}
}
