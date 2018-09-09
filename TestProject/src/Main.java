
public class Main {
	public static void main(String[] args) {
		
		displayGreeting();
	}
	private static void displayGreeting() {
		String salute = "Hey buddy.";
		// var assignment
		salute = salute.replace("buddy","loser");
		//used mutator "replace"
		System.out.println(salute);
		// print new string
		System.out.println(salute.length());
		//print length of string. 
	}
}
