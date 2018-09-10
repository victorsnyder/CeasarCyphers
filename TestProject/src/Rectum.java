import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

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
			
	}
		
	public static void main (String[] args) 
	{
		JFrame frame = new JFrame();
		
		frame.setSize(200, 200);
		
		Rectum component = new Rectum();
		
		frame.add(component);
		
		frame.setVisible(true);
		
				
			
	}
		
}		
		
			
		
		


