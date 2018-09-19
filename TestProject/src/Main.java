import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;


public class Main {
	public static void main(String[] args) {
		
		String salute = "Hey buddy.";
		// var assignment
			salute = salute.replace("buddy","loser");
		//used mutator "replace" to reassign the value of salute
		System.out.println(salute);
		// print new string
		System.out.println(salute.length());
		//print length of string. 
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		//We gon' make a box, translate it, access data and print it. 
		Rectangle box = new Rectangle(5, 5, 150, 150);
			box.translate(-3,10);
		System.out.println(box.getX());
		//using accessors and mutators for Character class
		//in an if-then-else structure.
		char ch = '5';
		if (Character.isLetter(ch))
			{System.out.println("this be a character");
			}	
		else
			System.out.println("this not be a character");
		// I implemented a counter class!!  Here's me applying it. 
		int clicks = 0;
		
		CounterPractice counter = new CounterPractice();
			counter.click();
			counter.click();
			clicks = counter.getValue();
		System.out.println(clicks);
		// or..
			counter.click();
		System.out.println(counter.getValue());
		//let's test out the cash register class I made..
		DaRegister reggy = new DaRegister();
			reggy.PurchaseTax(10, true);
			reggy.Payment(20);
			
		System.out.println(reggy.giveChange());
		
		//I can add the "main" method from the graphics class in this
		//project and run it. 
				//create a frame as a "canvas".
				JFrame frame = new JFrame();
				//set it's size.
				frame.setSize(600, 500);
				//create an object of the type of your class.
				Rectum component = new Rectum();
				//add the component to the empty frame
				frame.add(component);
				//make it visible
				frame.setVisible(true);
				//add the closing operation
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//we create and add a component from our CarComponent class.
				//the evidence suggests that one cannot have more than one component per frame.
				JFrame frame2 = new JFrame();
				frame2.setSize(400,400);
				CarComponent Suzies = new CarComponent();
				frame2.add(Suzies);
				frame2.setVisible(true);
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//^^^works^^^, one component per frame.
			
	}
		
	
		
}
