import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
//this class is basically one giant drawing class
public class Rectum extends JComponent
{
//when creating on object of the "Rectum" class, I'll feed it no arguments
//thus, It'll just run the method below, no questions asked. 
	public void paintComponent(Graphics g)
	{
			//Recover Graphics2D
			Graphics2D g2 = (Graphics2D) g;
			
			//everything in here is a local variable and/or operation. 
			//it all dies when you close the frame. 
			Rectangle box = new Rectangle(5, 5, 50, 50);
			g2.draw(box);
			box.translate(20, 40);
			g2.draw(box);
			//other way to draw le box
			g2.drawRect(200, 200, 120, 220);
			//imported and drew code for circle.
			Ellipse2D.Double ellipse = new Ellipse2D.Double(20, 30, 500, 200);
			g2.draw(ellipse);
			// drawing strings, part of Graphics2D class. 
			g2.drawString("Sup Bro", 200, 100);
			//to color shapes:
			//setColor works for outlines.
			g2.setColor(Color.CYAN);
			g2.draw(box);
			//to fill it use method fill.
			box.translate(30, 50);
			g2.setColor(Color.RED);
			g2.fill(box);
			//Drawing lines; Import the Line2D class.
			Line2D.Double line = new Line2D.Double(20, 20, 60, 80);
			g2.draw(line);
			// you can also draw it by using endpoints
			// you have to import the Point2D class
			Point2D.Double from = new Point2D.Double(50, 70);
			Point2D.Double to = new Point2D.Double(80, 100);
			
			Line2D.Double segment = new Line2D.Double(from, to);
			g2.draw(segment);
			
	
	}
	
		
	public static void main (String[] args) 
	{	//create a frame as a "canvas".
		JFrame frame = new JFrame();
		//set it's size.
		frame.setSize(600, 500);
		//create an object of the type of your "Rectum" class.
		Rectum component = new Rectum();
		//add the component to the empty frame
		frame.add(component);
		//make it visible
		frame.setVisible(true);
		//add the closing operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
				
			
	}
		
}		
		
			
		
		


