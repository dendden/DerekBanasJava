import java.io.*;

public class Lesson6 {
	
	public static void main(String[] args) {
		getFile("./some_shit.txt");
	}
	
	public static void getFile(String fileName) {
		try {
			FileInputStream file = new FileInputStream(fileName);
		}
		catch (FileNotFoundException e) {
			System.out.println("Sorry, can't find this file");
		}
//		catch (IOException e) {
//			System.out.println("Unknown IO error...");
//		}
//		catch (ClassNotFoundException e) {} // <= ignoring exception
		catch (Exception e) {
			System.out.println("Some weird error occurred...");
		}
		finally {
			System.out.println("");
		}
	}
}
