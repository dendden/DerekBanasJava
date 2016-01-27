import java.util.*;

public class Lesson6 {
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("How old are you?");
		int age = checkValidAge();
		
		if ( age != 0 ) {
			System.out.println("You are " + age + " years old.");
		}
	}
	
	public static int checkValidAge() {
		try {
			return userInput.nextInt();
		}
		catch (InputMismatchException e) {
			userInput.next();
			System.out.println("That's not a whole number!");
			return 0;
		}
	}
}
