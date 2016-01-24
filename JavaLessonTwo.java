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

            int numberAbs = Math.abs(numberEntered);
            int whichIsBigger = Math.max(5,7); // => 7
            int whichIsSmaller = Math.min(5,7); // => 5

            double numSqrt = Math.sqrt(numberEntered);
            System.out.println("Square root of your number is " + numSqrt);

            int numCeiling = (int) Math.ceil(numSqrt);
            System.out.println("Ceiling of square root of your number is " + numCeiling);
            int numFloor = (int) Math.floor(numSqrt);
            System.out.println("Floor of square root of your number is " + numFloor);
            int numRound = (int) Math.round(numSqrt);

            int randomNum = (int) (Math.random() * 10);
            System.out.println("Random number 0 through 10: " + randomNum);
        } else {
            System.out.println("Enter an integer next time");
        }
    }
}
