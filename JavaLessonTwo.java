import java.util.Scanner;

public class JavaLessonTwo {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Your favourite number: ");

        if (userInput.hasNextInt()) {
            int numberEntered = userInput.nextInt();
            System.out.println("You entered " + numberEntered);
            
            int numberEnteredTimes2 = numberEntered * 2;
            System.out.println(numberEntered + " times 2 equals " + numberEnteredTimes2);
        } else {
            System.out.println("Enter an integer next time");
        }
    }
}
