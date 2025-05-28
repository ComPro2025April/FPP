package lab3.prog3_3;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		if (size == strArray.length) {
			resize();
		}
		strArray[size] = s;
		size++;
		System.out.println("Added " + s + " to the list");
	}

	public String get(int i) {
		if (i < 0 || i >= size) return null;
		return strArray[i];
	}

	public boolean find(String s) {
		if (s == null) return false;
		for (int i = 0; i < size; i++) {
			if (s.equals(strArray[i])) return true;
		}
		return false;
	}

	public void insert(String s, int pos) {
		if (pos < 0 || pos > size) return;
		if (size == strArray.length) resize();

		for (int i = size; i > pos; i--) {
			strArray[i] = strArray[i - 1];
		}

		strArray[pos] = s;
		size++;
	}

	public boolean remove(String s) {
		int idx = -1;
		for (int i = 0; i < size; i++) {
			if (s.equals(strArray[i])) {
				idx = i;
				break;
			}
		}

		if (idx == -1) return false;

		for (int i = idx; i < size - 1; i++) {
			strArray[i] = strArray[i + 1];
		}

		strArray[size - 1] = null; // Clear last element
		size--;
		return true;
	}

	private void resize() {
		int newLength = strArray.length * 2;
		String[] temp = new String[newLength];
		System.arraycopy(strArray, 0, temp, 0, size);
		strArray = temp;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			sb.append(strArray[i]);
			if (i != size - 1) sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.insert("Richard", 3);
		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
	}
}
