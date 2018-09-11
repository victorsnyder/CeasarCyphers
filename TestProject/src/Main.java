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
		
		
		
	
		
	}
		
	
		
}
