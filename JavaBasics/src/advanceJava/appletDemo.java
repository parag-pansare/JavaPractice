package advanceJava;
import java.awt.*;
import java.applet.*;

/* <applet Code=appletDemo width=400 height=400>
 </applet> */

public class appletDemo extends Applet {
	
	public void init() {
		
		setBackground(Color.black);
		setForeground(Color.yellow);
	
	}
	
	public void paint(Graphics g) {
		
		Font f = new Font("Arial", 3, 30);
		Color c = new Color(255,0,0);
		
		g.setColor(Color.green);
		g.setFont(f);
		g.drawString("Welcome to Applets", 40, 40);
	}
	
	
	
}


//// Applets not supported in version of JAVA