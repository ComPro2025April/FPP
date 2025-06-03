package lab5.prog5_3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		StringSort ss = new StringSort(new StringLengthComparator());

		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };
		String[] arr = {"elephant", "dog", "zebra", "cat", "hippo"};

		ss.stringSort(arr);

		System.out.println(Arrays.asList(arr));
	}
}
