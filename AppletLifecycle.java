import java.awt.*;
import java.applet.*;

/**
<applet code="AppletLifecycle" width="300" height="200">
</applet>
*/
public class AppletLifecycle extends Applet {
    
    // Called once when the applet is initialized
    public void init() {
        System.out.println("Applet Initialized: init() called");
    }

    // Called each time the applet is started
    public void start() {
        System.out.println("Applet Started: start() called");
    }

    // Called to perform any cleanup when the applet is stopped
    public void stop() {
        System.out.println("Applet Stopped: stop() called");
    }

    // Called once when the applet is destroyed
    public void destroy() {
        System.out.println("Applet Destroyed: destroy() called");
    }

    // Called whenever the applet needs to repaint itself
    public void paint(Graphics g) {
        g.drawString("Applet Lifecycle Demo", 20, 20); // Display message
        System.out.println("Painting Applet: paint() called");
    }
}
