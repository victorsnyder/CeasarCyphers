import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.geom.Ellipse2D;

public class Rectum extends JComponent
{

	public void paintComponent(Graphics g)
	{
			//Recover Graphics
			Graphics2D g2 = (Graphics2D) g;
			
			Rectangle box = new Rectangle(5, 5, 50, 50);
			g2.draw(box);
			box.translate(20, 40);
			g2.draw(box);
			//other way to draw le box
			g2.drawRect(20, 20, 20, 20);
			//imported and drew code for circle.
			Ellipse2D.Double ellipse = new Ellipse2D.Double(20, 30, 500, 200);
			g2.draw(ellipse);
	}
	
		
	public static void main (String[] args) 
	{
		JFrame frame = new JFrame();
		
		frame.setSize(600, 500);
		
		Rectum component = new Rectum();
		
		frame.add(component);
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
				
			
	}
		
}		
		
			
		
		


