
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
//we import all the geometry classes
public class Car 
{
	//we specify instances for the top of the car and the left of the car
	private int xLeft;
	private int yTop;
	//we make a constructor that determines origin coordinates
	public Car(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}
	
	//now we make a drawing method that shapes the car relevant to it's origin.
	public void draw(Graphics2D g2)
	{
		//first, the body
		Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
		
		//now the wheels	
		Ellipse2D.Double frontWheel = new Ellipse2D.Double(xLeft + 7, yTop + 15, 15, 15);
		Ellipse2D.Double rearWheel = new Ellipse2D.Double(xLeft + 40, yTop + 15, 15, 15);
		
		//now the outline for the top of the car		
		Point2D.Double c1 = new Point2D.Double(xLeft + 10, yTop+10);
		Point2D.Double c2 = new Point2D.Double(xLeft + 25, yTop-5);
		Point2D.Double c3 = new Point2D.Double(xLeft + 40, yTop-5);
		Point2D.Double c4 = new Point2D.Double(xLeft + 45, yTop+10);
		
		//now we connect the points with lines:
		Line2D.Double l1 = new Line2D.Double(c1, c2);
		Line2D.Double l2 = new Line2D.Double(c2, c3);
		Line2D.Double l3 = new Line2D.Double(c3, c4);
	
		//now we draw:
		g2.draw(body);
		g2.draw(frontWheel);
		g2.draw(rearWheel);
		g2.draw(l1);
		g2.draw(l2);
		g2.draw(l3);
		
	}
}
