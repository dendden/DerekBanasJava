import java.util.Scanner;

public class Lesson5 {
    static Scanner userInput = new Scanner(System.in);
    static int randomNumber;
    // static double myPi = 3.14159; // <= Class variable

    public static void main(String[] args) {
        System.out.println(getRandomNum());

        boolean guessResult = false;
        int randomGuess = 0;

        while ( !guessResult ) {
            System.out.print("Guess a number between 0 and 50: ");
            randomGuess = userInput.nextInt();
            guessResult = checkGuess(randomGuess);
        }
        System.out.println("Yes, the random number is " + randomGuess);
    }

    public static int getRandomNum() {
        randomNumber = (int) (Math.random() * 51);
        return randomNumber;
    }

    public static boolean checkGuess(int guess) {
        return guess == randomNumber;
    }
}
