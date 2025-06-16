package lab13.prog13_1.filesearch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
//PSEUDO-CODE
boolean searchForFile(Object file, Object startDir) {
	Object[] fileSystemObjects =
						startDir.getContents();
	for(Object o: fileSystemObjects) {
		//base case
		if(isFile(o) && isSameFile(o,f)) {
			return true;
		}

		if(isDirectory(o)) {
			searchForFile(file, o);
		}
	}
	//file not found in startDir
	return false;
}

public class FileSearch {
	static boolean found = false;
	//Store the text that is found in the
	//file that is found in this String variable
	static String discoveredText = null;
	public static boolean searchForFile(String filename, String startDir) {
		//implement
		return false;	
	}
}
*/


public class FileSearch {
	static boolean found = false;

	// Stores the text found in the discovered file
	static String discoveredText = null;

	public static boolean searchForFile(String filename, String startDir) {
		File directory = new File(startDir);
		if (!directory.exists() || !directory.isDirectory()) {
			return false;
		}
		found = false; // reset before starting
		discoveredText = null;
		search(directory, filename);
		return found;
	}

	private static void search(File dir, String filename) {
		if (found) return; // stop searching once found

		File[] files = dir.listFiles();
		if (files == null) return;

		for (File file : files) {
			if (file.isFile() && file.getName().equals(filename)) {
				found = true;
				discoveredText = readFile(file);
				System.out.println("File found: " + file.getAbsolutePath());
				System.out.println("Contents:\n" + discoveredText);
				return;
			} else if (file.isDirectory()) {
				search(file, filename);
			}
		}
	}

	private static String readFile(File file) {
		StringBuilder content = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				content.append(line).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content.toString();
	}
}
