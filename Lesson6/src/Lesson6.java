import java.io.*;

public class Lesson6 {
	
	public static void main(String[] args) {
		try {
			getFile("./some_shit.txt");
		}
		catch (IOException e) {
			System.out.println("An IO error occurred");
		}
	}
	
	public static void getFile(String fileName)  throws FileNotFoundException,
	IOException {
		FileInputStream file = new FileInputStream(fileName);
	}
}
