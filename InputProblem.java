import java.util.Scanner;

public class InputProblem {
  public static void main (String[] args ){
	String dessert;
	
	//Scanner To Read Input
	@SuppressWarnings("resource")
	Scanner keyboard = new Scanner (System.in);
	
	// Print the Question
	System.out.println ("What is the name of your favorite dessert");
	
	//User Input Code
	dessert = keyboard.nextLine();
	
	//Set Char Result
	char dessertchar = dessert.charAt(0);

	// Output the User Input In Various Ways
	System.out.println(dessert.toUpperCase());
	System.out.println(dessert.toLowerCase());
	System.out.println(dessert.length());
	System.out.println(dessertchar);
  }
}
