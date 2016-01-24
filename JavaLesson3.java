public class JavaLesson3 {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 10);
        System.out.println(randomNum);

        char grade = 'B';
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Great job!");
                break;
            case 'B':
            case 'b':
                System.out.println("Good job!");
                break;
            case 'C': case 'c':
                System.out.println("Not bad!");
                break;
            case 'D': case 'd':
                System.out.println("That was NOT good!");
                break;
            case 'E':
            case 'e':
                System.out.println("You sucked!");
                break;
            default:
                System.out.println("No such grade!");
        }
    }
}
