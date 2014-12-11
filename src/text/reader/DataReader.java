package text.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DataReader {

	/**
	 * This class contains a main method which will be able to read a file.
	 */
	public static void main(String[] args) {
		/*
		 * Use java API to read a file from external sources(can be a text file
		 * in your documents folder) You must use Try...catch and finally block.
		 * You must use while loop.Use String array for extra credit.
		 */
		String fileName = "c:\\Users\\cheikhniass\\Desktop\\file.txt";

		try {
			// Attempt to open the file
			File file = new File(fileName);
			Scanner scan = new Scanner(file);

			while (scan.hasNext()) {
				String line = scan.nextLine();
				JOptionPane.showMessageDialog(null, line);

			}

			scan.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showInputDialog(null, "File not found");

		}

	}

}
