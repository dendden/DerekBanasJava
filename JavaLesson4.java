import java.util.Scanner;

public class JavaLesson4 {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        //WHILE loop:
        // int i = 0;

        // while ( i < 21 ) {
        //     if ( i == 3 ) {
        //         i += 2;
        //         continue;
        //     }

        //     System.out.println(i);
        //     i++;
        // }

        // PI loop:
        // double myPi = 4.0;
        // double j = 3.0;
        // // 4 - 4/3 + 4/5 - 4/7 + 4/9 ...

        // while ( j < 11 ) {
        //     myPi = myPi - 4/j + 4/(j+2);
        //     j += 4;
        //     System.out.println(myPi);
        // }

        // System.out.println("Value of PI:" + Math.PI);

        String contYesOrNo = "y";
        int i = 0;

        while ( contYesOrNo.equalsIgnoreCase("y") ) {
            System.out.println(i);
            System.out.println("Continue? (Y or N) ");
            contYesOrNo = userInput.nextLine();
            i += 1;
        }
    }
}
