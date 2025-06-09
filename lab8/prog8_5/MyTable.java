package lab8.prog8_5;

public class MyTable {
	private Entry[] entries;

	public MyTable(){
		entries = new Entry[26];
	}

	//returns the String that is matched with char c in the table
	public String get(char c){
		//implement
		if('a' <= c && c <= 'z')
			if(entries[c-97] != null)
				return entries[c-97].str;
		return null;
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		//implement
		if('a' <= c && c <= 'z')
			entries[c-97] = new Entry(s, c);
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Entry e : entries){
			if(e != null)
				sb.append(e.toString()).append("\n");
		}
		if(sb.length() > 0)
			return sb.toString();
		return null;
	}
	
	private class Entry {
		String str;
		char ch;

		Entry(String str, char ch){
			//implement
			this.str = str;
			this.ch = ch;
		}

		//returns a String of the form "ch->str" 
		public String toString() {
			//implement
			if(this.str != null)
				return ch+"->"+str;
			return null;
		}
	}

	public static void main(String[] args){
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('c',"Charlie");
		String s = t.get('b');
		System.out.println(s);

		System.out.println(t);
	}
}