import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

//in this class, we apply the Car class that we implemented, 
//including it's methods, constructors, instances, etc.
public class CarComponent extends JComponent
{
	//make paintComponent and cast the graphics 
	public void paintComponent(Graphics g)
	{
		
		Graphics2D g2 = (Graphics2D) g;
		//we created the car object.
		Car Suzie = new Car(30, 30);
		//now we order it drawn.
		Suzie.draw(g2);
		
	}
	
}

