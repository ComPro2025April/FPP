package lab5.prog5_1;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
	Comparator<String> myComparator;
	static StringSort instance;

	private StringSort() {

	}

	public static StringSort getInstance() {
		if(instance == null) {
			instance = new StringSort();
		}
		return instance;
	}

	public StringSort(Comparator<String> myComparator) {
		this.myComparator = myComparator;
	}

	public String[] stringSort(String[] arr) {
		Arrays.sort(arr, myComparator);
		return arr;
	}
}


