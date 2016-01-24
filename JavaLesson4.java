public class JavaLesson4 {
    public static void main(String[] args) {
        //WHILE loop:
        int i = 0;

        while ( i < 21 ) {
            if ( i == 3 ) {
                i += 2;
                continue;
            }

            System.out.println(i);
            i++;
        }
    }
}
