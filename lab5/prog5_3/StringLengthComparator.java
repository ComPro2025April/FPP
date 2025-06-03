package lab5.prog5_3;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
	public int compare(String s1, String s2) {
		return Integer.compare(s1.length(), s2.length());
	}
}
