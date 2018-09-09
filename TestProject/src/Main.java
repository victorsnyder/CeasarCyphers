import java.awt.Rectangle;

public class Main {
	public static void main(String[] args) {
		
		displayGreeting();
	}
	private static void displayGreeting() {
		String salute = "Hey buddy.";
		// var assignment
		salute = salute.replace("buddy","loser");
		//used mutator "replace" to reassign the value of salute
		System.out.println(salute);
		// print new string
		System.out.println(salute.length());
		//print length of string. 
		Rectangle box = new Rectangle(5, 5, 15, 50);
		box.translate(-3,10);
		System.out.println(box.getX());
		
	}
}
