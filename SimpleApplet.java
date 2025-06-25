import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="SimpleApplet" width="300" height="200">
</applet>
*/

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, Applet World!", 50, 100);
    }
}