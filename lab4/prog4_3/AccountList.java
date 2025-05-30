package lab4.prog4_3;

public class AccountList {
	private final int INITIAL_LENGTH = 2;
	private Account[] acntArray;
	private int size;

	public AccountList() {
		acntArray = new Account[INITIAL_LENGTH];
		size = 0;
	}

	public void add(Account s) {
		if (size == acntArray.length) {
			resize();
		}
		acntArray[size] = s;
		size++;
	}

	public Account get(int i) {
		if (i < 0 || i >= size) return null;
		return acntArray[i];
	}

	public Account[] getAll() {
		return acntArray;
	}

	public boolean find(String s) {
		if (s == null) return false;
		for (int i = 0; i < size; i++) {
			if (s.equals(acntArray[i])) return true;
		}
		return false;
	}

	public void insert(Account s, int pos) {
		if (pos < 0 || pos > size) return;
		if (size == acntArray.length) resize();

		for (int i = size; i > pos; i--) {
			acntArray[i] = acntArray[i - 1];
		}

		acntArray[pos] = s;
		size++;
	}

	public boolean remove(Account s) {
		int idx = -1;
		for (int i = 0; i < size; i++) {
			if (s.equals(acntArray[i])) {
				idx = i;
				break;
			}
		}

		if (idx == -1) return false;

		for (int i = idx; i < size - 1; i++) {
			acntArray[i] = acntArray[i + 1];
		}

		acntArray[size - 1] = null; // Clear last element
		size--;
		return true;
	}

	private void resize() {
		int newLength = acntArray.length + 1;
		Account[] temp = new Account[newLength];
		System.arraycopy(acntArray, 0, temp, 0, size);
		acntArray = temp;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			sb.append(acntArray[i]);
			if (i != size - 1) sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}

	public int size() {
		return size;
	}
}
