package lab13.prog13_1.filesearch;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import junit.framework.TestCase;

public class Test extends TestCase {
	static File insert;
	private final String expectedText = "This is the file you are seeking!";

    @Override
	public void setUp() {
		File f = new File("C:\\testCode\\level1\\level2\\finalLevel");
		System.out.println(f.mkdirs());
		f = new File("C:\\testCode\\level1\\level2a\\thirdLevel");
		System.out.println(f.mkdirs());
		f = new File("C:\\testCode\\level1\\level2b\\thirdLevelb");
		System.out.println(f.mkdirs());
		f = new File("C:\\testCode\\level1\\level2b\\thirdLevelc\\fourthLevel");
		System.out.println(f.mkdirs());
		insert = new File(f.getAbsolutePath() + "\\seek.txt");
		System.out.println("writing to " + insert.getAbsolutePath());
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(insert)));
			pw.write(expectedText);
			pw.flush();
			pw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void testSearchForFile() {

        String setupDirectory = "C:\\testCode";
        String targetFile = "seek.txt";
        boolean result = FileSearch.searchForFile(targetFile, setupDirectory);
		assertTrue(result);
        assertEquals(expectedText, FileSearch.discoveredText.trim());
	}
}
